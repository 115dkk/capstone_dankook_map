package com.example.capstone_dankook_map

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.capstone_dankook_map.astar.AStar
import com.example.capstone_dankook_map.astar.Node

class InsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inside)

        val btn = findViewById<Button>(R.id.button)
        val text = findViewById<TextView>(R.id.textView)

        btn.setOnClickListener{
            val ans = Astar(3,3)
            val intStr: String = ans.replace("[^0-9]", "")
            text.setText(ans)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.libraryinsidemenu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val imageview = findViewById<ImageView>(R.id.imageView3)

        when (item?.itemId) {
            R.id.b2f -> imageview.setImageResource(R.mipmap.lib_fl_1)
            R.id.b1f -> imageview.setImageResource(R.mipmap.lib_fl_2)
            R.id.u1f -> imageview.setImageResource(R.mipmap.lib_fl_3)
            R.id.u2f -> imageview.setImageResource(R.mipmap.lib_fl_4)
            R.id.u3f -> imageview.setImageResource(R.mipmap.lib_fl_5)
            R.id.u4f -> imageview.setImageResource(R.mipmap.lib_fl_6)
        }
        return super.onOptionsItemSelected(item)
    }



    fun Astar(a:Int , b:Int): String {
        val initialNode = Node(10, 11)
        val finalNode = Node(a, b)
        val rows = 20
        val cols = 20
        val aStar = AStar(rows, cols, initialNode, finalNode)
        val blocksArray = arrayOf(
            intArrayOf(0, 5),
            intArrayOf(0, 6),
            intArrayOf(0, 7),
            intArrayOf(0, 8),
            intArrayOf(0, 9),
            intArrayOf(0, 10),
            intArrayOf(0, 11),
            intArrayOf(0, 16),
            intArrayOf(0, 19),
            intArrayOf(1, 5),
            intArrayOf(1, 6),
            intArrayOf(1, 7),
            intArrayOf(1, 8),
            intArrayOf(1, 9),
            intArrayOf(1, 10),
            intArrayOf(1, 11),
            intArrayOf(1, 16),
            intArrayOf(1, 19),
            intArrayOf(2, 5),
            intArrayOf(2, 11),
            intArrayOf(2, 19),
            intArrayOf(3, 5),
            intArrayOf(3, 6),
            intArrayOf(3, 7),
            intArrayOf(3, 9),
            intArrayOf(3, 10),
            intArrayOf(3, 11),
            intArrayOf(3, 13),
            intArrayOf(3, 14),
            intArrayOf(3, 15),
            intArrayOf(3, 16),
            intArrayOf(3, 17),
            intArrayOf(3, 18),
            intArrayOf(3, 19),
            intArrayOf(4, 0),
            intArrayOf(4, 1),
            intArrayOf(4, 2),
            intArrayOf(4, 3),
            intArrayOf(4, 17),
            intArrayOf(5, 0),
            intArrayOf(6, 0),
            intArrayOf(6, 18),
            intArrayOf(6, 19),
            intArrayOf(7, 0),
            intArrayOf(7, 1),
            intArrayOf(7, 2),
            intArrayOf(7, 3),
            intArrayOf(7, 4),
            intArrayOf(7, 5),
            intArrayOf(7, 18),
            intArrayOf(7, 19),
            intArrayOf(8, 2),
            intArrayOf(8, 5),
            intArrayOf(8, 15),
            intArrayOf(8, 16),
            intArrayOf(8, 17),
            intArrayOf(8, 18),
            intArrayOf(8, 19),
            intArrayOf(9, 0),
            intArrayOf(9, 2),
            intArrayOf(9, 3),
            intArrayOf(9, 4),
            intArrayOf(9, 5),
            intArrayOf(9, 15),
            intArrayOf(10, 9),
            intArrayOf(10, 11),
            intArrayOf(10, 15),
            intArrayOf(11, 2),
            intArrayOf(11, 4),
            intArrayOf(11, 5),
            intArrayOf(11, 7),
            intArrayOf(11, 9),
            intArrayOf(11, 11),
            intArrayOf(11, 13),
            intArrayOf(11, 15),
            intArrayOf(11, 16),
            intArrayOf(11, 17),
            intArrayOf(11, 18),
            intArrayOf(11, 19),
            intArrayOf(12, 0),
            intArrayOf(12, 1),
            intArrayOf(12, 2),
            intArrayOf(12, 4),
            intArrayOf(12, 7),
            intArrayOf(12, 9),
            intArrayOf(12, 10),
            intArrayOf(12, 11),
            intArrayOf(12, 13),
            intArrayOf(13, 4),
            intArrayOf(13, 7),
            intArrayOf(13, 9),
            intArrayOf(13, 10),
            intArrayOf(13, 11),
            intArrayOf(13, 13),
            intArrayOf(14, 4),
            intArrayOf(14, 7),
            intArrayOf(14, 9),
            intArrayOf(14, 10),
            intArrayOf(14, 11),
            intArrayOf(14, 13)
        )
        aStar.setBlocks(blocksArray)
        val path = aStar.findPath()
        var ans = ""
        for (node in path) {
            ans += node
        }
        return ans
    }
}