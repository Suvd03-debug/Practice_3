package com.androidbook.a5_2
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val check1 = findViewById<CheckBox>(R.id.check1)
        val check2 = findViewById<CheckBox>(R.id.check2)
        val check3 = findViewById<CheckBox>(R.id.check3)
        val check4 = findViewById<CheckBox>(R.id.check4)
        val btnResult = findViewById<Button>(R.id.btnResult)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnResult.setOnClickListener {

            val selected = listOf(check1, check2, check3, check4).count { it.isChecked }

            if (selected == 0) {
                tvResult.text = "소방관의 용품을 선택해주세요"
            } else if (check1.isChecked && check4.isChecked
                && !check2.isChecked && !check3.isChecked
            ) {
                tvResult.text = "정답입니다! 소방차와 장갑이 소방관의 용품입니다."
            } else {
                tvResult.text = "틀렸습니다. 다시 선택해보세요."
            }
        }
    }
}