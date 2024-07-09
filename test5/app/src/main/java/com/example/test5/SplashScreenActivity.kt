package com.example.test5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.core.graphics.alpha

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val numberr=findViewById<ImageView>(R.id.iv_note)
        numberr.alpha=0f
        numberr.animate().setDuration(1500).alpha(1f).withEndAction{
            val i=Intent(this,SignInActivity::class.java)
            startActivity(i)
            //overrideActivityTransition(android.R.anim.fade_in,android.R.anim.fade_out)
            finish()
        }



    }

}