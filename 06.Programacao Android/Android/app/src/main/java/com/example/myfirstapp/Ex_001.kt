package com.example.myfirstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityEx001Binding
import com.example.myfirstapp.databinding.ActivityEx002Binding

class Ex_001 : AppCompatActivity() {
    private val binding by lazy{
        ActivityEx001Binding.inflate(layoutInflater)
    }

    /**
     * App para Unir dois EditText's e apresentar resultado
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.buttonPress.setOnClickListener {
            var firstName: String = binding.firstName.text.toString()
            var surname: String = binding.surname.text.toString()
            var name = firstName + " " + surname
            binding.resultadoBtn.text = "$name"
            Toast.makeText(applicationContext, "Olá $name", Toast.LENGTH_SHORT).show()
        }

        binding.toEx002.setOnClickListener{
            val intent = Intent(this, Ex_002::class.java)
            startActivity(intent)
        }
    }
}