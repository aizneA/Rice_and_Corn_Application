package com.riceandcornapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CreditsActivity : AppCompatActivity() {

    lateinit var t0: TextView
    lateinit var t1: TextView
    lateinit var t2: TextView
    lateinit var t3: TextView
    lateinit var t4: TextView
    lateinit var t5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_credits)

        t0 = findViewById(R.id.txt_0)
        t1 = findViewById(R.id.txt_1)
        t2 = findViewById(R.id.txt_2)
        t3 = findViewById(R.id.txt_3)
        t4 = findViewById(R.id.txt_4)
        t5 = findViewById(R.id.txt_5)

        //Developers
        t0.setText("Algupera, Aizzy Dianne" + "\n Wee, Adzhar")

        //Adviser
        t1.setText("Liao, Mara Marie (WMSU)")

        //Instructor
        t2.setText("Lines, Marvic (WMSU)")

        //Photos by
        t3.setText("Aizzy and Wee" + "\n kaggle.com")

        //References
        t4.setText("http://www.knowledgebank.irri.org/" +
                "\n https://www.gardeningknowhow.com/" +
                "\n https://cals.cornell.edu/" +
                "\n Field Guide by Philippine Rice Research Institute")

        //Special Thanks
        t5.setText("Sir Rolando R. Narisma (PhilRice)")

    }
}