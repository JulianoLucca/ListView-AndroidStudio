package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class Final : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutfinal)


        var liberta = ArrayList<Lista>()
        liberta.add(Lista(R.drawable.galo, R.drawable.flamengo, "Atlético-MG", "Flamengo"))

        var times = findViewById<ListView>(R.id.lvlista)
        times.adapter = ListaAdpter(this, liberta)


        var btnfinal = findViewById<Button>(R.id.btnfinal)
        btnfinal.setOnClickListener {
            var intent = Intent(this, Campeao::class.java)
            startActivity(intent)
        }
    }
}


