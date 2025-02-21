package com.example.androidmvvm.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.androidmvvm.data.PersonRepository

class LoginViewModel: ViewModel() {

    private var login = MutableLiveData<Boolean>()
    private val personRepository = PersonRepository()

    fun login(): LiveData<Boolean>{
        return login
    }

    fun doLogin(email: String, password: String) {
        login.value = personRepository.login(email, password)
    }

}