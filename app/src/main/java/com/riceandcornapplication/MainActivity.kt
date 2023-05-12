package com.riceandcornapplication

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.MediaStore
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.riceandcornapplication.ml.Model
import org.tensorflow.lite.support.image.TensorImage


class MainActivity : AppCompatActivity () {

    lateinit var select_image_button : Button
    lateinit var make_prediction : Button
    lateinit var img_view : ImageView
    lateinit var bitmap: Bitmap
    lateinit var camerabtn : Button
    lateinit var prev_btn : ImageButton
    lateinit var acu_view: TextView
    val positiveButtonClick = { dialog: DialogInterface, which: Int ->
        Toast.makeText(applicationContext, android.R.string.yes, Toast.LENGTH_SHORT).show()
    }
    companion object {
        lateinit var name_view : TextView
    }

    private fun checkandGetpermissions(){
        if (checkSelfPermission(android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED){
            requestPermissions(arrayOf(android.Manifest.permission.CAMERA),100)
        }
        else{
            Toast.makeText(this,"Camera Permission Granted", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.plant_nav -> {
                this.startActivity(Intent(this, CropDiseaseInformationActivity::class.java))
                return true
            }
            R.id.what_disease -> {
                this.startActivity(Intent(this, InformationActivity::class.java))
                return true
            }
            R.id.nut_defi -> {
                this.startActivity(Intent(this, NutrientDeficiency::class.java))
                return true
            }
            R.id.tutorial -> {
                this.startActivity(Intent(this, NavigateActivity::class.java))
                return true
            }
            R.id.credits -> {
                this.startActivity(Intent(this, CreditsActivity::class.java))
                return true
            }
            R.id.exit_option -> {
                this.finish()
                System.out.close()
            }
            else -> super.onOptionsItemSelected(item)
        }
        when (item.itemId) {
            android.R.id.home ->{
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    @RequiresApi(Build.VERSION_CODES.ECLAIR)
    override fun finish() {
        super.finish()
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray)
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 100) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, "Permission Denied", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Camera Permission Granted", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        select_image_button = findViewById(R.id.strg_btn)
        make_prediction = findViewById(R.id.clsf_btn)
        img_view = findViewById(R.id.image_view)
        camerabtn = findViewById(R.id.cptr_btn)
        name_view = findViewById(R.id.clssfctn_view)
        prev_btn = findViewById(R.id.lghtblb_btn)

        //icon beside application name
        val actionBar = supportActionBar
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.setIcon(R.mipmap.rac_launcher)
        //actionBar.setDisplayShowTitleEnabled(false)

        checkandGetpermissions()

        //Button for file storage
        select_image_button.setOnClickListener(View.OnClickListener {
            Log.d("msg", "Button Pressed")
            val intent : Intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            startActivityForResult(intent, 250)

            make_prediction.isEnabled = select_image_button.isPressed()
        })

        //Button for predicting disease
        make_prediction.setOnClickListener(View.OnClickListener {
            val resized = Bitmap.createScaledBitmap(bitmap, 224,224,true)
            val model = Model.newInstance(this)

            val tbuffer = TensorImage.fromBitmap(resized)
            val byteBuffer = tbuffer.buffer

            val image = TensorImage.fromBitmap(bitmap)

            val outputs = model.process(image)

            val maxProbability = outputs.probabilityAsCategoryList.maxByOrNull { it.score }
            val prediction = maxProbability!!.label

            val percentage = maxProbability.score * 100

            if (percentage >= 50)
            {
                name_view.text = prediction.toString()
                Toast.makeText(this, "Click the Bulb Icon for Prevention Method", Toast.LENGTH_SHORT).show()

                //Button for the prevention method (must be visible after clicking the --
                // "Classify" Button)
                prev_btn.setOnClickListener(View.OnClickListener {
                    val intent = Intent (this, PreventionActivity::class.java)
                    intent.putExtra("dis_name", name_view.text)
                    startActivity(intent)
                })
            }
            else if(percentage <=49)
            {
                val showmessage = AlertDialog.Builder(ContextThemeWrapper(this, R.style.AlertDialog))
                with(showmessage)
                {
                    setTitle("ERROR!")
                    setMessage("Image not recognized. Upload a new related image.")
                    setPositiveButton("OK", DialogInterface.OnClickListener(function = positiveButtonClick))
                    show()
                }
            }
            model.close()
        })

        //Function for the camera
        camerabtn.setOnClickListener(View.OnClickListener {
            val camera : Intent = Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(camera, 200)

            make_prediction.isEnabled = camerabtn.isPressed()
        })
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 250){
            img_view.setImageURI(data?.data)

            val uri : Uri? = data?.data
            bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)
        }
        else if(requestCode == 200 && resultCode == Activity.RESULT_OK){
            bitmap = data?.extras?.get("data") as Bitmap
            img_view.setImageBitmap(bitmap)
        }
    }

}