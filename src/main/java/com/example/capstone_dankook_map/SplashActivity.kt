package com.example.capstone_dankook_map

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        moveMain(1) //1초 후 main activity 로 넘어감
    }

    private fun moveMain(sec: Int) {
        Handler().postDelayed({
            //new Intent(현재 context, 이동할 activity)
            val intent = Intent(applicationContext, MapsActivity::class.java)
            startActivity(intent) //intent 에 명시된 액티비티로 이동
            finish() //현재 액티비티 종료
        }, (1000 * sec).toLong()) // sec초 정도 딜레이를 준 후 시작
    }
}