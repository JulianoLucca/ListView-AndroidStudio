package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btninicio = findViewById<Button>(R.id.btninicio)
        btninicio.setOnClickListener {
            var intent = Intent(this, activity_lista::class.java)
            startActivity(intent)
        }
    }
}