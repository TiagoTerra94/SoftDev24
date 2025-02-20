package com.example.basededados.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.basededados.data.DBHelper
import com.example.basededados.databinding.ActivityLoginBinding
import com.example.basededados.databinding.ActivityRegisterUserBinding

class RegisterUser : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterUserBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)


        val db = DBHelper(this)

        var username: String = binding.usernameReg.text.toString()
        var password: String = binding.passwordReg.text.toString()

        val utilizador = db.verificarCredenciais(username, password)

        if(utilizador != true){
            binding.btnRegistar.setOnClickListener {
                val intent = Intent(this, ActivityLoginBinding::class.java)
                startActivity(intent)
            }
        }else{
            Toast.makeText(applicationContext, "Username ou Password inválido", Toast.LENGTH_SHORT).show()
        }



    }
}