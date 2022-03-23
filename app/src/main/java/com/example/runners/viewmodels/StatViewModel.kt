package com.example.runners.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.runners.repository.Repository

class StatViewModel @ViewModelInject constructor(val repository:Repository):ViewModel(){
    
}