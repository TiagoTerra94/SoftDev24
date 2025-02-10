package com.example.mysecondapp.PersonalInfo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityInfoFormBinding

class Info_Form : AppCompatActivity() {
    private val binding by lazy{
        ActivityInfoFormBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent

        binding.nomeEdit.setText(i.getStringExtra("nome"))
        binding.moradaEdit.setText(i.getStringExtra("morada"))
        binding.telefoneEdit.setText(i.getStringExtra("telefone"))
        binding.emailEdit.setText(i.getStringExtra("email"))


        binding.btnSendInfo.setOnClickListener{
            val resultIntent = Intent(this, Resultado_Form::class.java)
            resultIntent.putExtra("nome",binding.nomeEdit.text.toString())
            resultIntent.putExtra("morada",binding.moradaEdit.text.toString())
            resultIntent.putExtra("telefone",binding.telefoneEdit.text.toString())
            resultIntent.putExtra("email",binding.emailEdit.text.toString())
            startActivity(resultIntent)
        }


    }
}