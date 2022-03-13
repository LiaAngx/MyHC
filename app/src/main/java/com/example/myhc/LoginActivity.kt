package com.example.myhc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<View>(R.id.btn_login)
        val btnRegister = findViewById<View>(R.id.btn_register)
        btnLogin.setOnClickListener {
            startActivity(Intent(this, HomePage::class.java))
            finish()
        }
        btnRegister.setOnClickListener {
            startActivity(Intent(this, Register::class.java))


        }
    }
}