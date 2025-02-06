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
            val i = Intent(this, Resultado_Form::class.java)
            i.putExtra("nome",binding.nomeEdit.text.toString())
            i.putExtra("morada",binding.moradaEdit.text.toString())
            i.putExtra("telefone",binding.telefoneEdit.text.toString())
            i.putExtra("email",binding.emailEdit.text.toString())
            setResult(1,i)
            finish()
        }


    }
}