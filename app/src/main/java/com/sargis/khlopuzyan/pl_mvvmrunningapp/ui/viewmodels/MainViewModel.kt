package com.sargis.khlopuzyan.pl_mvvmrunningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.sargis.khlopuzyan.pl_mvvmrunningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

//class MainViewModel @Inject constructor(
//class MainViewModel @ViewModelInject constructor(
@HiltViewModel
class MainViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

}