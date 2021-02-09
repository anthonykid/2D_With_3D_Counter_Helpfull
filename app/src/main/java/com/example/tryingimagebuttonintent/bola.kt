package com.example.tryingimagebuttonintent

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class bola : AppCompatActivity(), View.OnClickListener{
    var jari: TextView? = null
    var luas: TextView? = null
    var volume: TextView? = null

    lateinit var count : Button

    override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        setContentView(R.layout.bola)
        jari = findViewById<View>(R.id.jari) as TextView
        volume = findViewById<View>(R.id.volume) as TextView
        luas = findViewById<View>(R.id.luas) as TextView

        count = findViewById<View>(R.id.count) as Button
        count.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        convertToAll()
    }

    protected fun convertToAll() {
        val `val` = jari!!.text.toString().toDouble()
        luas!!.text = java.lang.Double.toString(4 * 3.14 * `val` * `val`)
        volume!!.text = java.lang.Double.toString((4 * 3.14 * `val` * `val` * `val`)/3)
    }
}