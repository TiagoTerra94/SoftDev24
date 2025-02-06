package com.example.mysecondapp.Hello

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityAlterarNomeBinding

class Alterar_Nome : AppCompatActivity() {
    private val binding by lazy {
        ActivityAlterarNomeBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent

        binding.etNovoNome.setText(i.getStringExtra("nome"))

        binding.btnSalvarNome.setOnClickListener{
            i.putExtra("nome",binding.etNovoNome.text.toString())
            setResult(1,i)
            finish()
        }

    }
}