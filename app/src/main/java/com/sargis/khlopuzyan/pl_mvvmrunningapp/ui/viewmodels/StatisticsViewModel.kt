package com.sargis.khlopuzyan.pl_mvvmrunningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.sargis.khlopuzyan.pl_mvvmrunningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//class StatisticsViewModel @Inject constructor(
//class StatisticsViewModel @ViewModelInject constructor(
@HiltViewModel
class StatisticsViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

}