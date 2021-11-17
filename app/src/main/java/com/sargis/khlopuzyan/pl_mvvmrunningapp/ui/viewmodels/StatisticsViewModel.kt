package com.sargis.khlopuzyan.pl_mvvmrunningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.sargis.khlopuzyan.pl_mvvmrunningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//class StatisticsViewModel @Inject constructor(
//class StatisticsViewModel @ViewModelInject constructor(
@HiltViewModel
class StatisticsViewModel @Inject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {

    val totalTimeRun = mainRepository.getTotalTimeInMillis()
    val totalDistance = mainRepository.getTotalDistance()
    val totalCaloriesBurned = mainRepository.getTotalCaloriesBurned()
    val totalAvgSpeed = mainRepository.getTotalAvgSpeed()

    val runsSortedByDate = mainRepository.getAllRunsSortedByDate()
}