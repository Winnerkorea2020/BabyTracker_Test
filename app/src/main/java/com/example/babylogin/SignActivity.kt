package com.example.babylogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_main)


        val btn1 = findViewById<Button>(R.id.signupButton_hello)


        btn1.setOnClickListener {
            val intent = Intent(this, ConfirmFinish::class.java)

            startActivity(intent)
        }

    }
}




