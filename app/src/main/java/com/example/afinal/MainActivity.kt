package com.example.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val secbutton = findViewById<Button> (R.id.onb1)
        secbutton.setOnClickListener{
            val intent = Intent(this,login::class.java)
            startActivity(intent)
            finish()
        }
    }
}