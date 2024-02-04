package com.example.valentinesday

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class Third : AppCompatActivity() {

    private lateinit var yesButton3: Button
    private lateinit var noButton3: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        showGif()

        yesButton3 = findViewById(R.id.yesButton3)
        noButton3 = findViewById(R.id.noButton3)

        yesButton3.setOnClickListener {
            startActivity(Intent(this, Fourth::class.java))
        }

        noButton3.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

    fun showGif() {
        val image: ImageView = findViewById(R.id.imageView3)

        Glide.with(this).load(R.drawable.tom).into(image)
    }
}