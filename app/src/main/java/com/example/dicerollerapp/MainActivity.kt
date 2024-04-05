package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        // Create new Dice object with 6 sides and roll it
        val dadu = Dadu(6)
        val diceRoll = dadu.roll()

        // Update textView sesuai hasil roll Dice
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dadu(private val numSides: Int) {
     //Fungsi buat roll angka random
    fun roll(): Int {
        return (1..numSides).random()
    }
}