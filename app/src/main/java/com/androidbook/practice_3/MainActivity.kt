package com.androidbook.practice_3
import android.graphics.Color
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val answerId = R.id.radio2   // 정답 번호에 맞게 변경 (1~4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            if (checkedId == answerId) {
                tvResult.text = "정답입니다!"
                tvResult.setTextColor(Color.BLUE)
            } else {
                tvResult.text = "틀렸습니다. 다시 선택하세요."
                tvResult.setTextColor(Color.RED)
            }
        }
    }
}