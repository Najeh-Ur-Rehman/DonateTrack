package com.example.todolistapp

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.todolistapp.theme.ToDoListAppTheme
import com.example.todolistapp.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val webView = findViewById<WebView>(R.id.webview)
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webView.loadUrl("file:///android_asset/to_do_list.html")
    }
}
