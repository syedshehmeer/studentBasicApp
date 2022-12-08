package com.example.studentapplicationv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //        here add control the duration andd call the mainactivity after splash screen
        supportActionBar?.hide()
//        now here add handler to get the mainactivity from some duration
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivities(arrayOf(intent))
            finish()
        },3000)
    }
}