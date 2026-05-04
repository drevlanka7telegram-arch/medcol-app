package com.example.medcolapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Плитка "Абитуриентам" - открывает раздел сайта
        findViewById<androidx.cardview.widget.CardView>(R.id.card_abiturient).setOnClickListener {
            openWebView("https://medcol-ptz.ru/abiturientam")
        }

        // Плитка "Студентам"
        findViewById<androidx.cardview.widget.CardView>(R.id.card_student).setOnClickListener {
            openWebView("https://medcol-ptz.ru/studentam")
        }

        // Плитка "Новости"
        findViewById<androidx.cardview.widget.CardView>(R.id.card_news).setOnClickListener {
            openWebView("https://medcol-ptz.ru/novosti")
        }

        // Кнопка "Контакты"
        btn_contacts.setOnClickListener {
            startActivity(Intent(this, ContactsActivity::class.java))
        }
    }

    private fun openWebView(url: String) {
        val intent = Intent(this, WebViewActivity::class.java)
        intent.putExtra("url", url)
        startActivity(intent)
    }
}
