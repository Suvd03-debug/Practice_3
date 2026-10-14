package com.androidbook.practice_3
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cbs = listOf<CheckBox>(
            findViewById(R.id.cb1), findViewById(R.id.cb2),
            findViewById(R.id.cb3), findViewById(R.id.cb4)
        )
        val names = listOf("소방차", "청진기", "핸드믹서", "장갑")
        val btn = findViewById<Button>(R.id.btnResult)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btn.setOnClickListener {
            // 재시작하기
            if (btn.text == "재시작하기") {
                cbs.forEach { it.isChecked = false }
                tvResult.text = "소방관의 용품을 선택해주세요"
                btn.text = "결과보기"
                return@setOnClickListener
            }

            val selected = cbs.indices.filter { cbs[it].isChecked }
            if (selected.isEmpty()) {
                Toast.makeText(this, "소방관의 용품을 선택해주세요", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 선택한 물건 이름 토스트
            val msg = selected.joinToString(", ") { names[it] } + "을(를) 선택했습니다."
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

            // 정답: 소방차(1) + 장갑(4)
            tvResult.text = if (selected == listOf(0, 3)) "맞았습니다" else "틀렸습니다"
            btn.text = "재시작하기"
        }
    }
}