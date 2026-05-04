package com.example.medcolapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<MaterialButton>(R.id.btn_applicants).setOnClickListener {
            openWebView(getString(R.string.url_applicants), getString(R.string.menu_applicants))
        }

        findViewById<MaterialButton>(R.id.btn_students).setOnClickListener {
            openWebView(getString(R.string.url_students), getString(R.string.menu_students))
        }

        findViewById<MaterialButton>(R.id.btn_news).setOnClickListener {
            startActivity(Intent(this, NewsActivity::class.java))
        }

        findViewById<MaterialButton>(R.id.btn_contacts).setOnClickListener {
            startActivity(Intent(this, ContactsActivity::class.java))
        }
    }

    private fun openWebView(url: String, title: String) {
        val intent = Intent(this, WebViewActivity::class.java)
        intent.putExtra("url", url)
        intent.putExtra("title", title)
        startActivity(intent)
    }
}
