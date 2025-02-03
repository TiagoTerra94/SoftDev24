package com.example.myfirstapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myfirstapp.databinding.ActivityEx002Binding
import com.example.myfirstapp.databinding.ActivityEx003Binding
import kotlin.text.Typography.dollar
import kotlin.text.Typography.euro

class Ex_003 : AppCompatActivity() {
    private val binding by lazy{
        ActivityEx003Binding.inflate(layoutInflater)
    }

    /**
     * App para Login
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.enter.setOnClickListener {
            var username: String = binding.username.text.toString()
            var password: String = binding.textPassword.text.toString()

            if (username == "user" && password == "password"){
                Toast.makeText(applicationContext, "Login Válido", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(applicationContext, "Login Inválido", Toast.LENGTH_SHORT).show()
            }

            binding.username.setText("")
            binding.textPassword.setText("")
        }

    }
}