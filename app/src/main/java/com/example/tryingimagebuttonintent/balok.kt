package com.example.tryingimagebuttonintent

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class balok : AppCompatActivity(), View.OnClickListener {
    var panjang: TextView? = null
    var lebar: TextView? = null
    var tinggi: TextView? = null
    var luas: TextView? = null
    var volume: TextView? = null

    lateinit var count: Button

    override fun onCreate(icicle: Bundle?) {
        super.onCreate(icicle)
        setContentView(R.layout.balok)
        panjang = findViewById<View>(R.id.panjang) as TextView
        lebar = findViewById<View>(R.id.lebar) as TextView
        tinggi = findViewById<View>(R.id.tinggi) as TextView
        volume = findViewById<View>(R.id.volume) as TextView
        luas = findViewById<View>(R.id.luas) as TextView

        count = findViewById<View>(R.id.count) as Button
        count.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        convertToAll()
    }

    protected fun convertToAll() {
        val `val` = panjang!!.text.toString().toDouble()
        val `val1` = lebar!!.text.toString().toDouble()
        val `val2` = tinggi!!.text.toString().toDouble()
        luas!!.text = java.lang.Double.toString(2 * (`val` * `val1` + `val` * `val2` + `val1` * `val2`))
        volume!!.text = java.lang.Double.toString(`val` * `val1` * `val2`)
    }
}