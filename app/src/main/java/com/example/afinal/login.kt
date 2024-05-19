package com.example.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val secbutton = findViewById<Button> (R.id.buttonLogin)
        secbutton.setOnClickListener{
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
            finish()
        }
    }
}