package com.example.medcolapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Just open the news page in WebView
        val intent = Intent(this, WebViewActivity::class.java)
        intent.putExtra("url", getString(R.string.url_news))
        intent.putExtra("title", getString(R.string.menu_news))
        startActivity(intent)
        finish() // close this activity immediately
    }
}
