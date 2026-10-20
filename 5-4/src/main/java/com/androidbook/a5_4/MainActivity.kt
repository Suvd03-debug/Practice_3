package com.androidbook.a5_4
import android.os.Bundle
import android.widget.ImageView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgBg = findViewById<ImageView>(R.id.imgBg)
        val imgLight1 = findViewById<ImageView>(R.id.imgLight1)
        val imgLight2 = findViewById<ImageView>(R.id.imgLight2)
        val imgLight3 = findViewById<ImageView>(R.id.imgLight3)
        val toggleSwitch = findViewById<ToggleButton>(R.id.toggleSwitch)

        toggleSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                imgBg.setImageResource(R.drawable.bg2)
                imgLight1.setImageResource(R.drawable.light21)
                imgLight2.setImageResource(R.drawable.light22)
                imgLight3.setImageResource(R.drawable.light23)
                toggleSwitch.setBackgroundResource(R.drawable.on)
            } else {
                imgBg.setImageResource(R.drawable.bg1)
                imgLight1.setImageResource(R.drawable.light11)
                imgLight2.setImageResource(R.drawable.light12)
                imgLight3.setImageResource(R.drawable.light13)
                toggleSwitch.setBackgroundResource(R.drawable.off)
            }
        }
    }
}