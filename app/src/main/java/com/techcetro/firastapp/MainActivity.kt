package com.techcetro.firastapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.graphics.Color
import java.util.Random
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun changeText(view: View) {
        val results = listOf("大吉", "中吉", "小吉", "吉", "末吉", "凶", "大凶")
        val random = Random().nextInt(results.count())
        if(random == 0) {
            resultText.setTextColor(Color.RED)
        } else {
            resultText.setTextColor(Color.BLACK)
        }
        resultText.text = results[random]
    }
}
