package com.androidbook.a5_5

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgCat = findViewById<ImageView>(R.id.imgCat)
        val imgLight = findViewById<ImageView>(R.id.imgLight)
        val switchCat = findViewById<SwitchCompat>(R.id.switchCat)
        val switchLight = findViewById<SwitchCompat>(R.id.switchLight)

        switchCat.setOnCheckedChangeListener { _, isChecked ->
            imgCat.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
        }

        switchLight.setOnCheckedChangeListener { _, isChecked ->
            imgLight.setImageResource(if (isChecked) R.drawable.light12 else R.drawable.light13)
        }
    }
}