package com.example.valentinesday

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var yesButton1: Button
    private lateinit var noButton1: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showGif()


        yesButton1 = findViewById(R.id.yesButton1)
        noButton1 = findViewById(R.id.noButton1)

        yesButton1.setOnClickListener {
            startActivity(Intent(this, Fourth::class.java))
        }

        noButton1.setOnClickListener {
            startActivity(Intent(this, Second::class.java))
        }


    }

    fun showGif() {
        val image: ImageView = findViewById(R.id.imageView1)
        Glide.with(this).load(R.drawable.tom).into(image)
    }
}