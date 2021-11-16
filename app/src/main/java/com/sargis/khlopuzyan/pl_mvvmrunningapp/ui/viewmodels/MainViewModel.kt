package com.sargis.khlopuzyan.pl_mvvmrunningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sargis.khlopuzyan.pl_mvvmrunningapp.db.Run
import com.sargis.khlopuzyan.pl_mvvmrunningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

//class MainViewModel @Inject constructor(
//class MainViewModel @ViewModelInject constructor(
@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

    fun insertRun(run: Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }

}