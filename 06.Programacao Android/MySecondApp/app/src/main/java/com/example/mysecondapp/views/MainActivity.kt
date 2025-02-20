package com.example.mysecondapp.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityMain3Binding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMain3Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        fun isPrime(number: Int): Boolean {
            // Verifica se o número é menor ou igual a 1
            if (number <= 1) {
                return false
            }

            // Verifica se o número é 2 ou 3 (os dois primeiros números primos)
            if (number == 2 || number == 3) {
                return true
            }

            // Elimina números pares maiores que 2
            if (number % 2 == 0) {
                return false
            }

            // Verifica divisores de 3 até a raiz quadrada de 'number'
            val sqrtNumber = Math.sqrt(number.toDouble()).toInt()
            for (i in 3..sqrtNumber step 2) {
                if (number % i == 0) {
                    return false
                }
            }

            return true
        }



        binding.btnResultado.setOnClickListener {
            var numero: Int = binding.editNumero.text.toString().toInt()


            if (numero % 2 == 0) {
                binding.textResultado.text = "Numero Par"
            } else {
                binding.textResultado.text = "Numero Impar"
            }

            if (isPrime(numero)) {
                binding.textPrimo.text = "Numero Primo"
            } else {
                binding.textPrimo.text = "Numero Não Primo"
            }
        }

        binding.voltarBtn.setOnClickListener{
            val intent = Intent(this, LoginOkActivity::class.java)
            startActivity(intent)
        }
    }
}
