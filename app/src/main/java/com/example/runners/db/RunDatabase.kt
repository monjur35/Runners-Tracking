package com.example.runners.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [RunModel::class],
    version = 1
)
@TypeConverters(BitmapConverter::class)
abstract class RunDatabase :RoomDatabase() {
    abstract fun getRunDao() :RunDao
}