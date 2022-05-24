package com.example.capstone_dankook_map

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class BuildingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_maps)

        door_front.setOnClickListener{ //(2)
            Toast.makeText(applicationContext, "버튼1 클릭", Toast.LENGTH_LONG).show()
        }
    }
}