package com.example.androidmvvm.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidmvvm.databinding.ActivityLoginBinding
import com.example.androidmvvm.model.LoginViewModel

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        viewModel.login().observe(this, Observer{
            if(it){
                Toast.makeText(this,"Login Ok", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"Login ERRADO", Toast.LENGTH_SHORT).show()
            }
        })

        binding.btnEntrar.setOnClickListener {
            val email = binding.editEmail.text.toString()
            val senha = binding.editPassword.text.toString()

            viewModel.doLogin(email,senha)
        }

    }
}