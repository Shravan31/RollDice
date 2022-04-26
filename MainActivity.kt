package com.example.mad1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var img:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button=findViewById(R.id.roll_button)
        img = findViewById(R.id.img_view)
        rollButton.setOnClickListener{
//            Toast.makeText(this, "Button clicked",Toast.LENGTH_SHORT).show()
            rollDice()

        }
    }

    private fun rollDice() {
//        val resultText:TextView = findViewById(R.id.text_update)
        val rollResult = Random.nextInt(6)+1
//        resultText.text = rollResult.toString()
        val randomImg = when(rollResult){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

//        val img : ImageView=findViewById(R.id.img_view)
        img.setImageResource(randomImg)
    }
}