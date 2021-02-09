package com.example.tryingimagebuttonintent

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class kubus : AppCompatActivity(), View.OnClickListener{
    var sisi: TextView? = null
    var luas: TextView? = null
    var volume: TextView? = null

    lateinit var count : Button

    override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        setContentView(R.layout.kubus)
        sisi = findViewById<View>(R.id.sisi) as TextView
        volume = findViewById<View>(R.id.volume) as TextView
        luas = findViewById<View>(R.id.luas) as TextView

        count = findViewById<View>(R.id.count) as Button
        count.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        convertToAll()
    }

    protected fun convertToAll() {
        val `val` = sisi!!.text.toString().toDouble()
        luas!!.text = java.lang.Double.toString(`val` * `val` * 6)
        volume!!.text = java.lang.Double.toString(`val` * `val` * `val`)
    }
}