package com.example.mysecondapp.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityAlunoBinding

class Aluno : AppCompatActivity() {
    private val binding by lazy {
        ActivityAlunoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var nome = intent.getStringExtra("nome").toString()
        var morada = intent.getStringExtra("morada").toString()
        var email = intent.getStringExtra("email").toString()

        binding.resultAluno.text = "Nome: $nome\n Morada: $morada\nEmail: $email"

    }
}