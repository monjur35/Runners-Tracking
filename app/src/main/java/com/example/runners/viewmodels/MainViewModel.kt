package com.example.runners.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.runners.repository.Repository

class MainViewModel @ViewModelInject constructor(val repository:Repository):ViewModel(){

}