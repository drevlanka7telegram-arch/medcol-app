package com.example.medcolapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textview.MaterialTextView

class ContactsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        supportActionBar?.title = "Контакты"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<MaterialTextView>(R.id.tv_address).text = "185001, Республика Карелия, г. Петрозаводск, ул. Советская, д. 15"
        findViewById<MaterialTextView>(R.id.tv_phone).text = "8 (8142) 59-93-33"
        findViewById<MaterialTextView>(R.id.tv_email).text = "medcol@zdrav10.ru"
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}
