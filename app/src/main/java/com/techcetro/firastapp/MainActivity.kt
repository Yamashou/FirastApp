package com.techcetro.firastapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v7.app.AlertDialog
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    companion object Factory {
        val EXTRA_TEXT = "com.usaco_pg.intentsample.EXTRA_TEXT"
    }

    fun changeActivity(view: View) {
        val text = editText.text?.toString()
        if (text == null || text == "") {
            AlertDialog.Builder(this)
                    .setTitle(resources.getText(R.string.alert_title))
                    .setMessage(resources.getText(R.string.hint_text))
                    .setPositiveButton(resources.getText(R.string.alert_button), null)
                    .show()
            return
        }
        val intent = Intent(this, SubActivity::class.java)
        intent.putExtra(EXTRA_TEXT, text)
        startActivity(intent)
    }
}