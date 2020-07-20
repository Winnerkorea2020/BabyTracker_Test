package com.example.babylogin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login_first.*


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_first)

        signupButton_hello.setOnClickListener {
            val email = editTextTextEmailAddress.text.toString()
            val passWord = editTextTextPassword.text.toString()

            Log.d("LoginActivity", "email is "+email)
            Log.d("LoginActivity", "Password is $passWord")

        }

        val btn1 = findViewById<TextView>(R.id.donhaveanaccount)
        val btn2 = findViewById<TextView>(R.id.textView12)
        val btn3 = findViewById<TextView>(R.id.textView2)

        btn1.setOnClickListener {
            val intent = Intent(this, SignActivity::class.java)

            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, SignActivity::class.java)

            startActivity(intent)


        }

        btn3.setOnClickListener {
            val intent = Intent(this, ForgetPassword::class.java)

            startActivity(intent)


        }



    }
}