package com.example.basededados.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.basededados.data.DBHelper
import com.example.basededados.databinding.ActivityLoginBinding
import com.example.basededados.databinding.ActivityRegisterUserBinding

class Login : AppCompatActivity() {

    private val binding by lazy{
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val db = DBHelper(this)

        var username: String = binding.usernameEdit.text.toString()
        var password: String = binding.passwordEdit.text.toString()



        binding.btnLogin.setOnClickListener{
            var username: String = binding.usernameEdit.text.toString()
            var password: String = binding.passwordEdit.text.toString()

            if (username == "Tiago" && password == "12345"){
                val intent = Intent(this, MyAccount::class.java)
                startActivity(intent)
            }else{
                val intent = Intent(this, WrongLogin::class.java)
                startActivity(intent)
            }
        }

        binding.btnRegister.setOnClickListener{
            val intent = Intent(this, ActivityRegisterUserBinding::class.java)
            startActivity(intent)
        }
    }
}