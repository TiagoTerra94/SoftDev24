package com.example.androidmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var textWelcome = MutableLiveData<String>()

    fun welcome(): LiveData<String>{
        return textWelcome
    }
}