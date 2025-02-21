package com.example.androidmvvm.data

class PersonRepository {

    fun login(email: String, password: String): Boolean{
        return (email.equals("admin") && password.equals("pass"))
    }

}