package com.example.mysecondapp.views

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityLoginErradoBinding

class LoginErradoActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityLoginErradoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Toast.makeText(applicationContext, "Login Inválido", Toast.LENGTH_SHORT).show()

        binding.btnBackActivity.setOnClickListener{
            val intent = Intent(this, MainActivityForm::class.java)
            startActivity(intent)
        }
    }
}