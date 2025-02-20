package com.example.mysecondapp.views

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityResultadoFormBinding

class Resultado_Form : AppCompatActivity() {
    private val binding by lazy {
        ActivityResultadoFormBinding.inflate(layoutInflater)
    }

    private lateinit var result: ActivityResultLauncher<Intent>
    private var nome = ""
    private var morada = ""
    private var telefone = ""
    private var email = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

                nome = intent.getStringExtra("nome").toString()
                morada = intent.getStringExtra("morada").toString()
                telefone = intent.getStringExtra("telefone").toString()
                email = intent.getStringExtra("email").toString()
                binding.result.text = "O $nome mora na $morada,\n tem o telefone $telefone e\n o email $email."

        binding.btnDados.setOnClickListener{
            val i = Intent(this, Info_Form::class.java)
            i.putExtra("nome", nome)
            i.putExtra("morada", morada)
            i.putExtra("telefone", telefone)
            i.putExtra("email", email)
            result.launch(i)
        }
    }
}