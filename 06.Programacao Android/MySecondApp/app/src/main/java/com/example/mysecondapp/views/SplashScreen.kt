package com.example.mysecondapp.views

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.R

class SplashScreen : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splash_screen)


            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, MainActivityForm::class.java)
                startActivity(intent)
                finish()
            },3000)

        }
}
