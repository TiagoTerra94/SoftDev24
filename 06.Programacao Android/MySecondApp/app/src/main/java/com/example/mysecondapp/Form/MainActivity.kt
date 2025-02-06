package com.example.mysecondapp.Form

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



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

        }
    }
}