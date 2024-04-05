package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Nyari Id Button
        val tombolRoll: Button = findViewById(R.id.button)

        // Set Click Listener buat spin dadu waktu user klik tombol button
        tombolRoll.setOnClickListener { rollDadu() }
    }

    private fun rollDadu() {
        val roll = (1..6).random()

        // Variabel buat roll dadu
        val rollGambar = when (roll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Variabel buat output imageView dadu
        val outputDadu: ImageView = findViewById(R.id.imageDadu)
        outputDadu.setImageResource(rollGambar)

        // Update textView sesuai hasil roll Dice
        val outputText: TextView = findViewById(R.id.textView)
        outputText.text = "Anda mendapat angka $roll"
    }
}