package com.sargis.khlopuzyan.pl_mvvmrunningapp.repositories

import androidx.lifecycle.LiveData
import androidx.room.Query
import com.sargis.khlopuzyan.pl_mvvmrunningapp.db.Run
import com.sargis.khlopuzyan.pl_mvvmrunningapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val runDAO: RunDAO
) {

    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDAO.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeMillis() = runDAO.getAllRunsSortedByTimeMillis()

    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunsSortedByCaloriesBurned()


    fun getTotalDistance() = runDAO.getTotalDistance()

    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()

    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()

    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()

}