package com.example.tryingimagebuttonintent

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import org.apache.http.NameValuePair
import org.apache.http.message.BasicNameValuePair
import java.util.*


class Login : AppCompatActivity(), View.OnClickListener{
    var un: EditText? = null
    var pw: EditText? = null
    var error: TextView? = null
    var i: String? = null

    lateinit var simpan: Button
    lateinit var cancel: Button


    /** Called when the activity is first created.  */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        un = findViewById<View>(R.id.et_un) as EditText
        pw = findViewById<View>(R.id.et_pw) as EditText
        error = findViewById<View>(R.id.tv_error) as TextView
        simpan = findViewById<View>(R.id.btn_login) as Button
        simpan.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val postParameters: ArrayList<NameValuePair> = ArrayList<NameValuePair>()
        postParameters.add(BasicNameValuePair("username", un!!.text.toString()))
        postParameters.add(BasicNameValuePair("password", pw!!.text.toString()))
        //String valid = "1";
        try {
            if (un!!.text.toString() == "dicky" && pw!!.text.toString() == "123") {
                Toast.makeText(applicationContext, "Login Berhasil", Toast.LENGTH_SHORT).show()
                button(view)
            } else {
                Toast.makeText(
                        applicationContext,
                        "Sorry!! username or password wrong",
                        Toast.LENGTH_SHORT
                ).show()
            }
        } catch (e: Exception) {
            un!!.setText(e.toString())
        }
    }
    fun button(view: View?) {
        val intent = Intent(this, menu_utama::class.java).apply {
        }
        startActivity(intent)
    }
}