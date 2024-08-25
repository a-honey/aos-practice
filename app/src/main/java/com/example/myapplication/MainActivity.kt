package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.contents.laboratory.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: PracticeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.testBtnId.setOnClickListener {
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
        }
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