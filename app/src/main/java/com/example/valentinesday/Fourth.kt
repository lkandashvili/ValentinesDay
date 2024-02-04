package com.example.valentinesday

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class Fourth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        showGif()
    }

    fun showGif() {
        val image: ImageView = findViewById(R.id.imageView4)
        Glide.with(this).load(R.drawable.tom2).into(image)
    }
}