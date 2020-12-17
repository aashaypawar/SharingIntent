package com.example.sharingintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shareBtn = findViewById<Button>(R.id.btnShare)
        val shareTxt = findViewById<EditText>(R.id.et1)

        shareBtn.setOnClickListener {
            val message = shareTxt.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_SEND
            i.type = "text/plain"
            i.putExtra(Intent.EXTRA_TEXT,message)
            startActivity(Intent.createChooser(i, "Share via"))
        }
    }
}