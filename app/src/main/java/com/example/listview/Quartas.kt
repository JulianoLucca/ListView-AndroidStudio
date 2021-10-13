package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class Quartas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutquartas)


        var liberta = ArrayList<Lista>()
        liberta.add(Lista(R.drawable.palmeiras, R.drawable.saopaulo, "Palmeiras", "São Paulo"))
        liberta.add(Lista(R.drawable.flamengo, R.drawable.olimpia, "Flamengo", "Olimpia"))
        liberta.add(Lista(R.drawable.galo, R.drawable.river, "Atlético-MG", "River Plate"))
        liberta.add(Lista(R.drawable.barcelona, R.drawable.fluminense, "Barcelona SC", "Fluminense"))

        var times = findViewById<ListView>(R.id.lvlista)
        times.adapter = ListaAdpter(this, liberta)

        var btnquartas = findViewById<Button>(R.id.btnquartas)
        btnquartas.setOnClickListener {
            var intent = Intent(this, Semifinal::class.java)
            startActivity(intent)}
    }
}
