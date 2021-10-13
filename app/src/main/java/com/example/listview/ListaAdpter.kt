package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class ListaAdpter (var context: Context, var Lista: List<Lista>) : BaseAdapter() {

    override fun getCount(): Int {
        return Lista.size
    }

    override fun getItem(p0: Int): Any {
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var view = LayoutInflater.from(context).inflate(R.layout.activity_lista, null)

        var escudoum = view.findViewById<ImageView>(R.id.escudoum)
        escudoum.setImageDrawable(context.getDrawable(Lista[p0].escudoum))

        var escudodois = view.findViewById<ImageView>(R.id.escudodois)
        escudodois.setImageDrawable(context.getDrawable(Lista[p0].escudodois))

        var timeum = view.findViewById<TextView>(R.id.timeum)
        timeum.text = Lista[p0].timeum

        var timedois = view.findViewById<TextView>(R.id.timedois)
        timedois.text = Lista[p0].timedois

        // retornando a view
        return view

    }
}