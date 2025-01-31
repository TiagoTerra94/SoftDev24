package com.example.myfirstapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myfirstapp.databinding.ActivityMainBinding

class Ex_001 : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.convertButton.setOnClickListener {
            var Celsius: Double = binding.valueCelsius.text.toString().toDouble()
            val Fahr = Celsius * 1.8 + 32
            binding.textResultado.text = "$Fahr ºF"
        }
    }
}