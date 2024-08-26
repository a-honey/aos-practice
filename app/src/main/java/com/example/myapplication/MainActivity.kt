package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val image1 = findViewById<ImageView>(R.id.photo1)

        image1.setOnClickListener {
            Toast.makeText(this,  "야옹", Toast.LENGTH_LONG).show()

            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("data", "hi")
            startActivity(intent)
        }

        val image2 = findViewById<ImageView>(R.id.photo2)

        image2.setOnClickListener {
            Toast.makeText(this,  "멍멍", Toast.LENGTH_LONG).show()
        }

        val image3 = findViewById<ImageView>(R.id.photo3)

        image3.setOnClickListener {
            Toast.makeText(this,  "찍찍", Toast.LENGTH_LONG).show()
        }
    }
}