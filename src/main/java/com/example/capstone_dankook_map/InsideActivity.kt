package com.example.capstone_dankook_map

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class InsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inside)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.libraryinsidemenu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val imageview = findViewById<ImageView>(R.id.imageView3)

        when (item?.itemId) {
            R.id.b2f -> imageview.setImageResource(R.mipmap.library_floor_b2)
            R.id.b1f -> imageview.setImageResource(R.mipmap.library_floor_b1)
            R.id.u1f -> imageview.setImageResource(R.mipmap.library_floor_1)
            R.id.u2f -> imageview.setImageResource(R.mipmap.library_floor_2)
            R.id.u3f -> imageview.setImageResource(R.mipmap.library_floor_3)
            R.id.u4f -> imageview.setImageResource(R.mipmap.library_floor_4)
        }
        return super.onOptionsItemSelected(item)
    }
}