package com.example.runners.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "run_table")
data class RunModel (
    var image:Bitmap?=null,
    var timeStamp:Long=0L,
    var avgSpeedinKMH:Float=0f,
    var distanceInMeters:Int=0,
    var timeInMillis:Long=0L,
    var burnedCalories:Int=0
        ){
    @PrimaryKey(autoGenerate = true)
    var id:Int?=null
}