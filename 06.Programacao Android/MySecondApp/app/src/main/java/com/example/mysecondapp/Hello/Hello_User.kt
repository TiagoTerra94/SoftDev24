package com.example.mysecondapp.Hello

import android.content.Intent
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.Form.LoginOkActivity
import com.example.mysecondapp.databinding.ActivityHelloUserBinding

class Hello_User : AppCompatActivity() {
    private val binding by lazy {
        ActivityHelloUserBinding.inflate(layoutInflater)
    }

    private lateinit var result: ActivityResultLauncher<Intent>
    private var nome = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnAlterarNome.setOnClickListener{
            val i = Intent(this, Alterar_Nome::class.java)
            i.putExtra("nome", nome)
            result.launch(i)
        }

        binding.btnVoltar.setOnClickListener {
            val intent = Intent(this, LoginOkActivity::class.java)
            startActivity(intent)
        }

        result = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
            if(it.data != null && it.resultCode == 1){
                nome = it.data?.getStringExtra("nome").toString()
                binding.tvSaudacao.text = "Olá $nome"
            }
        }
    }
}