package com.aces.ipt.project.sms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import com.aces.ipt.project.sms.databinding.ActivityLogInBinding
import com.aces.ipt.project.sms.databinding.ActivitySplashBinding

class LogIn_Activity : AppCompatActivity() {

    lateinit var binding: ActivityLogInBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler(Looper.getMainLooper()).postDelayed({
        val intent = Intent(this,LogIn_Activity::class.java)
        startActivity(intent)
        finish()
        },3000

        )


    }
}