package com.example.lab2lesson3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab2lesson3.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {



    // Create a new Color object with the random RGB values

private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
            // setContentView(R.layout.activity_main)
        setContentView(binding.root)
    }
    fun whenClick(view: View) {
        val random = java.util.Random()
        val alpha = random.nextInt(256)
        val red = random.nextInt(256)
        val green = random.nextInt(256)
        val blue = random.nextInt(256)

        // Set the color using Color.argb()
        val color = Color.argb(alpha, red, green, blue)

      binding.imageButton.setBackgroundColor(color)
    }

    fun clicked(view: View) {
        val random = java.util.Random()
        val alpha = random.nextInt(256)
        val red = random.nextInt(256)
        val green = random.nextInt(256)
        val blue = random.nextInt(256)

        // Set the color using Color.argb()
        val color = Color.argb(alpha, red, green, blue)
       // binding.imageButton.setBackgroundColor(color)
        binding.root.setBackgroundColor(color)
    }
}