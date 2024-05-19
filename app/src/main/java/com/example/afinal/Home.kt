package com.example.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val secbutton = findViewById<TextView> (R.id.categories_title)
        secbutton.setOnClickListener{
            val intent = Intent(this,onboard::class.java)
            startActivity(intent)
            finish()
        }
    }
}