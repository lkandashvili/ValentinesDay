package com.example.valentinesday

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class Second : AppCompatActivity() {

    private lateinit var yesButton2: Button
    private lateinit var noButton2: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showGif()

        yesButton2 = findViewById(R.id.yesButton2)
        noButton2 = findViewById(R.id.noButton2)

        yesButton2.setOnClickListener {
            startActivity(Intent(this, Fourth::class.java))
        }

        noButton2.setOnClickListener {
            startActivity(Intent(this, Third::class.java))
        }
    }


    fun showGif() {
        val image: ImageView = findViewById(R.id.imageView2)

        Glide.with(this).load(R.drawable.tom).into(image)
    }
}