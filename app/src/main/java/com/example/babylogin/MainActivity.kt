package com.example.babylogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.hello_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_main)

        loginbutton_hello.setOnClickListener {
            Log.d("Hello","Welcome to the Baby tracker")
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        signupButton_hello.setOnClickListener {
            Log.d("Sign up","Please Sign up Button")
            val intent = Intent(this, SignActivity::class.java)
            startActivity(intent)
        }
    }
}