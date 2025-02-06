package com.example.mysecondapp.PersonalInfo

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
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

        binding.btnDados.setOnClickListener{
            val i = Intent(this, Info_Form::class.java)
            i.putExtra("nome", nome)
            i.putExtra("morada", morada)
            i.putExtra("telefone", telefone)
            i.putExtra("email", email)
            result.launch(i)
        }

        result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if(it.data != null && it.resultCode == 1){
                nome = it.data?.getStringExtra("nome").toString()
                morada = it.data?.getStringExtra("morada").toString()
                telefone = it.data?.getStringExtra("telefone").toString()
                email = it.data?.getStringExtra("email").toString()
                binding.result.text = "O $nome mora na $morada, tem o telefone $telefone e o email $email."
            }
        }
    }
}