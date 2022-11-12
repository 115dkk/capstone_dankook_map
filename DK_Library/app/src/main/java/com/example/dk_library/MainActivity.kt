package com.example.dk_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dkuDB =
            Room.databaseBuilder(applicationContext, DKUMapLibDB::class.java, "DK_MAP_LIB_FLOOR")
                .createFromAsset("databases/DKU_Lib_Kor.db").build()

        CoroutineScope(Dispatchers.IO).launch {
            dkuDB.dklibDAO().delete(DKLib(0,"","","","","",""))
        }
        CoroutineScope(Dispatchers.IO).launch {
            dkuDB.dklibDAO().getAll()
        }
    }
}