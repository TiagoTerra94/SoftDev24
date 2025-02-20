package com.example.mysecondapp.views

import android.R.layout.simple_list_item_1
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityListaAlunosBinding

class ListaAlunos : AppCompatActivity() {
    private lateinit var binding: ActivityListaAlunosBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityListaAlunosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listAlunos = ArrayList<Alunos>()
        val aluno = Alunos("Tiago","Rua dos Prazeres","tiago@email.com")
        val aluno2 = Alunos("Rui", "Rua das Moelas", "rui@email.com")
        val aluno3 = Alunos("Ruben", "Rua dos Pasteis", "ruben@email.com")

        listAlunos.add(aluno)
        listAlunos.add(aluno2)
        listAlunos.add(aluno3)

        val arrayAdapter = ArrayAdapter(this, simple_list_item_1,listAlunos)
        binding.idListAlunos.adapter = arrayAdapter

        binding.idListAlunos.setOnItemClickListener{parent, view, position, id ->
            val i = Intent(this, Aluno::class.java)
            i.putExtra("nome", listAlunos[position].nome)
            i.putExtra("morada",listAlunos[position].morada)
            i.putExtra("email",listAlunos[position].email)
            startActivity(i)
        }

    }
}

