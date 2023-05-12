package com.riceandcornapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class splashScreen : AppCompatActivity() {

    lateinit var logo : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        logo = findViewById(R.id.rac_app)

        logo.alpha = 0f
        logo.animate().setDuration(2000).alpha(1f).withEndAction {
            val i = Intent (this, MainActivity :: class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}