package com.example.dk_library

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [DKLib::class], version = 1, exportSchema = false)
abstract class DKUMapLibDB :RoomDatabase() {
    abstract fun dklibDAO(): DKLibDAO
}