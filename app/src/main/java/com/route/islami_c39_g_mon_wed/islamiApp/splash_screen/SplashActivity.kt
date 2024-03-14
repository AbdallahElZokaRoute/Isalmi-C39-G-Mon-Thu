package com.route.islami_c39_g_mon_wed.islamiApp.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.route.islami_c39_g_mon_wed.R
import com.route.islami_c39_g_mon_wed.islamiApp.HomeActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(mainLooper).postDelayed({
            val intent = Intent(this@SplashActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 2500)


        // Drawable ->

        // Drawable-nodpi ->

        // drawable Android Sizes -> mdpi
        //  hdpi
        // xhdpi
        // xxhdpi
        // xxxhdpi

    }
}