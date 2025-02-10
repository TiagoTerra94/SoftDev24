package com.example.mysecondapp.Form

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.Alunos.ListaAlunos
import com.example.mysecondapp.Hello.Hello_User
import com.example.mysecondapp.ListaNomes.ListaNomes
import com.example.mysecondapp.ParPrimo.MainActivity
import com.example.mysecondapp.PersonalInfo.Info_Form
import com.example.mysecondapp.databinding.ActivityMain2Binding

class LoginOkActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.parPrimoBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.converterHorasBtn.setOnClickListener{
            val intent = Intent(this, com.example.mysecondapp.ConversorHoras.MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.helloUser.setOnClickListener{
            val intent = Intent(this, Hello_User::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnInfoForm.setOnClickListener{
            val intent = Intent(this, Info_Form::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnListaNomes.setOnClickListener{
            val intent = Intent(this, ListaNomes::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnListaaluno.setOnClickListener{
            val intent = Intent(this, ListaAlunos::class.java)
            startActivity(intent)
            finish()
        }
    }
}