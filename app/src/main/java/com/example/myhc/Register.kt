package com.example.myhc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val dataList = mutableMapOf<String,String>()

        val btnConfirm= findViewById<View>(R.id.btn_confirm)

        val btnBack = findViewById<View>(R.id.btn_back)

        btnConfirm.setOnClickListener {
            /*保存填写的数据操作


            */

            startActivity(Intent(this,HomePage::class.java))
            finish()
        }

        btnBack.setOnClickListener {

            finish()

        }

    }
}