package com.example.mysecondapp.ConversorHoras

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityMain4Binding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMain4Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        binding.btnConvert.setOnClickListener {
            var horas: Int = binding.editHoras.text.toString().toInt()

            val semanas = horas / 168  // 1 semana = 168 horas
            val dias = (horas % 168) / 24  // 1 dia = 24 horas
            val restantesHoras = horas % 24  // Horas restantes

            binding.resultado.text = "$semanas semanas\n $dias dias\n $restantesHoras horas"

        }
    }
}