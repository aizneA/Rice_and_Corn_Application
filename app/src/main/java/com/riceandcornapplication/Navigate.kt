package com.riceandcornapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NavigateActivity : AppCompatActivity() {

    lateinit var t0: TextView
    lateinit var t1: TextView
    lateinit var t2: TextView
    lateinit var t3: TextView
    lateinit var t4: TextView
    lateinit var t5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigate)

        t0 = findViewById(R.id.text_0)
        t1 = findViewById(R.id.text_1)
        t2 = findViewById(R.id.text_2)
        t3 = findViewById(R.id.text_3)
        t4 = findViewById(R.id.text_4)
        t5 = findViewById(R.id.text_5)

        //summary
        t0.setText("This application can assist on Corn and Rice Leaf Disease Recognition.")

        //capture button navi
        t1.setText("Capture Button for capturing image of diseases.")

        //storage
        t2.setText("Button for accessing file storage for images.")

        //classify
        t3.setText("Button for classifying the image being uploaded.")

        //grass icon
        t4.setText("Button for diseases information.")

        //lightbulb
        t5.setText("Prevention method after classifying a disease.")
    }
}