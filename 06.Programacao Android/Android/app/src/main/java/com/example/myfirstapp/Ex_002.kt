package com.example.myfirstapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapp.databinding.ActivityEx001Binding
import com.example.myfirstapp.databinding.ActivityEx002Binding
import kotlin.text.Typography.dollar

class Ex_002 : AppCompatActivity() {
    private val binding by lazy{
        ActivityEx002Binding.inflate(layoutInflater)
    }

    /**
     * App para converter moeda para PESO, REAL, DOLLAR
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverterDolar.setOnClickListener {
            var euro: Double = binding.editValorEuros.text.toString().toDouble()
            val dollar = euro * 1.20
            Toast.makeText(applicationContext, "$dollar $", Toast.LENGTH_SHORT).show()
        }

        binding.buttonConverterReal.setOnClickListener {
            var euro: Double = binding.editValorEuros.text.toString().toDouble()
            val real = euro * 4.4
            Toast.makeText(applicationContext, "$real R$", Toast.LENGTH_SHORT).show()
        }

        binding.buttonConverterPeso.setOnClickListener {
            var euro: Double = binding.editValorEuros.text.toString().toDouble()
            val peso = euro * 31.5
            Toast.makeText(applicationContext, "$peso P", Toast.LENGTH_SHORT).show()
        }
    }
}