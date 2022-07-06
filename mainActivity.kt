package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var button: button
    lateinit var imageview: imageview
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = FindViewById(R.id.button)
        imageview = FindViewById(R.id.image_view)
        val sidesOfDice: Int = 6

        button.setOnClickListener{
            val randomNumber:Int = (1..sidesOfDice).random()
            when (randomNumber){
                1 -> {imageview.setImageResource(R.drawable.dice_1)}
                2 -> {imageview.setImageResource(R.drawable.dice_2)}
                3 -> {imageview.setImageResource(R.drawable.dice_3)}
                4 -> {imageview.setImageResource(R.drawable.dice_4)}
                5 -> {imageview.setImageResource(R.drawable.dice__5)}
                6 -> {imageview.setImageResource(R.drawable.dice_6)}
            }
        }


        }



    }
}
