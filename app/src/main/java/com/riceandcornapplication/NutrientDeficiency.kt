package com.riceandcornapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class NutrientDeficiency : AppCompatActivity() {

    lateinit var t1: TextView
    lateinit var t2: TextView
    lateinit var t3: TextView
    lateinit var t4: TextView
    lateinit var t5: TextView
    lateinit var i1: ImageView
    lateinit var i2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nutrient_deficiency)

        //icon(?)
        val actionBar = supportActionBar
        actionBar!!.setDisplayShowHomeEnabled(true)
        actionBar.setIcon(R.mipmap.rac_launcher)

        t1 = findViewById(R.id.diag_plant)
        t2 = findViewById(R.id.diag_plant1)
        t3 = findViewById(R.id.diag_plant12)
        t4 = findViewById(R.id.diag_plant123)
        t5 = findViewById(R.id.diag_plant1234)
        i1 = findViewById(R.id.illus_def)
        i2 = findViewById(R.id.illus_def1)

        //nitrogen
        t1.setText("\t\t Symptoms:" +
                "\n \t\t\t ● stunted plant" +
                "\n \t\t\t ● reduced tiller number" +
                "\n \t\t\t ● small, narrow, erect leaves that turn yellowish-red and brown" +
                "\n \t\t\t ● old leaves become light straw-colored and wither" +
                "\n\n \t\t Corrective measures:" +
                "\n \t\t\t ● Apply nitrogen fertilizer as needed, based on the leaf color chat (LCC)" +
                "\n \t\t\t ● Split application of nitrogen to increase efficiency.")

        //phosphorus
        t2.setText("\t\t Symptoms:" +
                "\n \t\t\t ● stunted plant" +
                "\n \t\t\t ● reduced tiller number" +
                "\n \t\t\t ● erect stem with small. narrow, erect leaves" +
                "\n \t\t\t ● young leaves look normal but old ones turn brown and wither" +
                "\n\n \t\t Corrective measures:" +
                "\n \t\t\t ● Upon introduction of irrigation water or flooding, symptoms disappear and ferric phospate is reduced." +
                "\n \t\t\t ● Apply phosphorus fertilizer basally or at early tillering stage.")

        //potassium
        t3.setText("\t\t Symptoms:" +
                "\n \t\t\t ● stunted plant" +
                "\n \t\t\t ● slightly reduced tillering" +
                "\n \t\t\t ● yellowing interveinal areas lower leaves starting from the tip then later leaves turn brown and wither" +
                "\n \t\t\t ● old leaves with brown spots" +
                "\n\n \t\t Correctives measures:" +
                "\n \t\t\t ● Apply potassium fertilizer.")

        //zinc
        t4.setText("\t\t Symptoms:" +
                "\n \t\t\t ● stunted plant" +
                "\n \t\t\t ● reduced tiller number" +
                "\n \t\t\t ● base and midrib of young leaves are yellowish, while old leaves are rusty brown" +
                "\n \t\t\t ● reduced size of leaf blades" +
                "\n \t\t\t ● uneven growth of the plants" +
                "\n \t\t\t ● delayed maturity" +
                "\n\n \t\t Corrective measures:" +
                "\n \t\t\t ● Drain the field." +
                "\n \t\t\t ● Soil or foliar application of zinc fertilizer." +
                "\n \t\t\t ● Dip seedling roots in zinc oxide a day before transplanting.")

        //iron
        t5.setText("\t\t Symptoms:" +
                "\n \t\t\t ● stunted plant" +
                "\n \t\t\t ● reduced tiller number" +
                "\n \t\t\t ● leaves, especially the youngest, become yellow-whitish and brown" +
                "\n\n \t\t Corrective measures:" +
                "\n \t\t\t ● Apply sulfur or diluted sulfuric acid." +
                "\n \t\t\t ● Use ammonium sulfate instead of urea.")


        i1.setImageResource(R.drawable.illus_1)
        i2.setImageResource(R.drawable.illus_2)
    }
}