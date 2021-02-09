package com.example.tryingimagebuttonintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class contact : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contact)
        val Instagram: Button = findViewById(R.id.instagram)
        Instagram.setOnClickListener(this)

        val twitter: Button = findViewById(R.id.twitter)
        twitter.setOnClickListener(this)

        val github: Button = findViewById(R.id.github)
        github.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.instagram -> {
                val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/anthonyrustan/"))
                startActivity(i)
            }
            R.id.twitter -> {
                val t = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/anthony24729?s=09"))
                startActivity(t)
            }
            R.id.github -> {
                val g = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/anthonykid"))
                startActivity(g)
            }
        }
    }
}