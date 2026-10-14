package com.androidbook.practice_3

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ivShell = findViewById<ImageView>(R.id.ivShell)
        val listener = AnswerListener(ivShell)

        findViewById<ImageButton>(R.id.btn1).setOnClickListener(listener)
        findViewById<ImageButton>(R.id.btn2).setOnClickListener(listener)
        findViewById<ImageButton>(R.id.btn3).setOnClickListener(listener)
        findViewById<ImageButton>(R.id.btn4).setOnClickListener(listener)
    }
    inner class AnswerListener(private val shell: ImageView) : View.OnClickListener {
        override fun onClick(v: View) {
            val (img, correct) = when (v.id) {
                R.id.btn1 -> R.drawable.answer1 to false
                R.id.btn2 -> R.drawable.answer2 to true   // 정답: 2번
                R.id.btn3 -> R.drawable.answer3 to false
                else -> R.drawable.answer4 to false
            }
            shell.setImageResource(img)
            shell.visibility = View.VISIBLE
            Toast.makeText(
                this@MainActivity,
                if (correct) "맞았습니다" else "틀렸습니다",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}