package com.example.tryingimagebuttonintent

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tryingimagebuttonintent.R.id.*

class menu_utama : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_utama)

        val kubus: ImageButton = findViewById(R.id.button1)
        kubus.setOnClickListener(this)

        val bola: ImageButton = findViewById(R.id.button2)
        bola.setOnClickListener(this)

        val balok: ImageButton = findViewById(R.id.button3)
        balok.setOnClickListener(this)

        val contact: ImageButton = findViewById(R.id.button4)
        contact.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.button1 -> {
                val moveKubus = Intent(this, kubus::class.java)
                startActivity(moveKubus)
            }
            R.id.button2 -> {
                val moveBola = Intent(this, bola::class.java)
                startActivity(moveBola)
            }
            R.id.button3 -> {
                val moveBalok = Intent(this, balok::class.java)
                startActivity(moveBalok)
            }
            R.id.button4 -> {
                val moveBalok = Intent(this, contact::class.java)
                startActivity(moveBalok)
            }
        }
    }
}

