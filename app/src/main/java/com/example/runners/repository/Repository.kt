package com.example.runners.repository

import com.example.runners.db.RunDao
import com.example.runners.db.RunModel
import javax.inject.Inject

class Repository @Inject constructor(
    val  runDao: RunDao
)  {

    suspend fun insertRun(run:RunModel)=runDao.insertRunData(run)

    suspend fun deleteRun(run:RunModel)=runDao.deleteRun(run)

    fun getAllSortedRunByDate()=runDao.getAllSortedRunByDate()
    fun getAllSortedRunByMilies()=runDao.getAllSortedRunByMillis()
    fun getAllSortedRunByAvgSpeed()=runDao.getAllSortedRunByAvgSpeed()
    fun getAllSortedRunByBurnedCalories()=runDao.getAllSortedRunByburnedCalories()
    fun getAllSortedRunByDistance()=runDao.getAllSortedRunByDistance()
    fun getTotalBurnedCalories()=runDao.getTotalBurnedCalories()
    fun getTotalTimeInMilies()=runDao.getTotalTimeinMillis()
    fun getTotalDistance()=runDao.getTotalDistance()
    fun getTotalAvgSpeed()=runDao.getTotalAvgSpeed()

}