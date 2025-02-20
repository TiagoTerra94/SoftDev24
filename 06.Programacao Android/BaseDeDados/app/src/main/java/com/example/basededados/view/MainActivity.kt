package com.example.basededados.view

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.basededados.data.DBHelper
import com.example.basededados.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val db = DBHelper(this)

        val listaUtilizador = db.utilizadorListSelectAll()

        binding.listaView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaUtilizador)

    }
}