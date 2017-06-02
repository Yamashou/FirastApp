package com.techcetro.firastapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun changeText(view: View) {
        val textView = findViewById(R.id.text_view) as TextView
        textView.text = "Changed from Kotlin"
    }
}