package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class activity_lista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutlibertadores)

        var liberta = ArrayList<Lista>()
        liberta.add(Lista(R.drawable.galo, R.drawable.boca, "Atlético-MG", "Boca Juniors"))
        liberta.add(Lista(R.drawable.racing, R.drawable.saopaulo, "Racing", "São Paulo"))
        liberta.add(Lista(R.drawable.palmeiras, R.drawable.catolica, "Palmeiras", "Universidade Católica"))
        liberta.add(Lista(R.drawable.barcelona, R.drawable.velez, "Barcelona SC", "Vélez Sársfield"))

        liberta.add(Lista(R.drawable.juniors, R.drawable.river, "Argentinos Juniors", "River Plate"))
        liberta.add(Lista(R.drawable.flamengo, R.drawable.defensa, "Flamengo", "Defensa y Justicia"))
        liberta.add(Lista(R.drawable.inter, R.drawable.olimpia, "Internacional", "Olimpia"))
        liberta.add(Lista(R.drawable.fluminense, R.drawable.cerro, "Fluminense", "Cerro Porteño"))

        var times = findViewById<ListView>(R.id.lvlista)
        times.adapter = ListaAdpter(this, liberta)


        var btnoitavas = findViewById<Button>(R.id.btnoitavas)
        btnoitavas.setOnClickListener {
            var intent = Intent(this, Quartas::class.java)
            startActivity(intent)
        }
    }
}
