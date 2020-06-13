package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TUC_Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val button = findViewById<Button>(R.id.TucPhotoButton)
        button.setOnClickListener{
            val intent = Intent(this, TUC_Photos::class.java)
            startActivity(intent)
        }
    }
}