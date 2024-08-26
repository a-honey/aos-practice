package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityDiceBinding
import kotlin.random.Random

class DiceActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_dice)

        binding.diceButton.setOnClickListener{
            val dice1Number = Random.nextInt(1, 7).toString()
            val dice2Number = Random.nextInt(1, 7).toString()

            binding.dice1.text = dice1Number
            binding.dice2.text = dice2Number
        }
    }
}