package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class Semifinal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layoutsemifinal)

                var liberta = ArrayList<Lista>()
                liberta.add(Lista(R.drawable.galo, R.drawable.palmeiras, "Atlético-MG", "Palmeiras"))
                liberta.add(Lista(R.drawable.barcelona, R.drawable.flamengo, "Barcelona SC", "Flamengo"))

                var times = findViewById<ListView>(R.id.lvlista)
                times.adapter = ListaAdpter(this, liberta)


                var btnsemifinal = findViewById<Button>(R.id.btnsemifinal)
                btnsemifinal.setOnClickListener {
                    var intent = Intent(this, Final::class.java)
                    startActivity(intent)
                }
            }
        }
