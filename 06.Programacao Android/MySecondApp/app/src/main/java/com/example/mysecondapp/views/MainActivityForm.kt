package com.example.mysecondapp.views

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityMainBinding

class MainActivityForm : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sharedPreferences = this.getSharedPreferences("chave", Context.MODE_PRIVATE)
        val valor = sharedPreferences.getString("chave","").toString()

        binding.username.setText(valor)
        binding.password.setText(valor)


        binding.loginEnter.setOnClickListener{
            var username: String = binding.username.text.toString()
            var password: String = binding.password.text.toString()

            if (username == "Tiago" && password == "12345"){
                val intent = Intent(this, LoginOkActivity::class.java)
                startActivity(intent)
            }else{
                val intent = Intent(this, LoginErradoActivity::class.java)
                startActivity(intent)
            }

            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("chave",binding.username.text.toString())
            editor.putString("chave",binding.password.text.toString())
            editor.apply()

        }
    }
}