package com.example.mysecondapp.ListaNomes

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityListaNomesBinding
//Crie uma aplicação que apresente uma lista de nomes de pessoas (String) e sempre que
//clicado num dos elementos deve aparecer um Toast com a mensagemOlá + nomepessoa
//clicada
class ListaNomes : AppCompatActivity() {
    private val binding by lazy{
        ActivityListaNomesBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val lista = ArrayList<String>();

        lista.add("Joao")
        lista.add("Rui")
        lista.add("Manuel")
        lista.add("Ruben")

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,lista)
        binding.listaNomes.adapter = arrayAdapter

        binding.btnAdd.setOnClickListener{
            val nome: String = binding.addItem.text.toString()

            lista.add(nome)

            // Atualiza a ListView
            arrayAdapter.notifyDataSetChanged()


            binding.addItem.text.clear()

        }

        binding.listaNomes.setOnItemClickListener{parent, view, position, id ->
            Toast.makeText(
                this,
                "Olá ${lista.get(position)}",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}