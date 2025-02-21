package com.example.androidmvvm.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var textWelcome = MutableLiveData<String>()

    init{
        textWelcome.value = "Olá Turma SoftDev"
    }

    fun welcome(): LiveData<String>{
        return textWelcome
    }
}