package com.example.runners.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRunData(run: RunModel)

    @Delete
    suspend fun deleteRun(run: RunModel)

    @Query("SELECT * FROM run_table ORDER BY timeStamp DESC")
    fun getAllSortedRunByDate(): LiveData<List<RunModel>>

    @Query("SELECT * FROM run_table ORDER BY timeInMillis DESC")
    fun getAllSortedRunByMillis(): LiveData<List<RunModel>>

    @Query("SELECT * FROM run_table ORDER BY avgSpeedinKMH DESC")
    fun getAllSortedRunByAvgSpeed(): LiveData<List<RunModel>>

    @Query("SELECT * FROM run_table ORDER BY burnedCalories DESC")
    fun getAllSortedRunByburnedCalories(): LiveData<List<RunModel>>

    @Query("SELECT * FROM run_table ORDER BY distanceInMeters DESC")
    fun getAllSortedRunByDistance(): LiveData<List<RunModel>>


    @Query("SELECT sum(timeInMillis) FROM run_table")
    fun getTotalTimeinMillis(): LiveData<Long>

    @Query("SELECT sum(burnedCalories) FROM run_table")
    fun getTotalBurnedCalories(): LiveData<Int>

    @Query("SELECT sum(distanceInMeters) FROM run_table")
    fun getTotalDistance(): LiveData<Int>

    @Query("SELECT sum(avgSpeedinKMH) FROM run_table")
    fun getTotalAvgSpeed(): LiveData<Float>


}