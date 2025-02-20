package com.example.mysecondapp.views

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mysecondapp.adapter.CarroListAdapter
import com.example.mysecondapp.data.CarroMock
import com.example.mysecondapp.databinding.ActivityRecycleViewBinding

class RecyclerView : AppCompatActivity() {
    private val binding by lazy {
        ActivityRecycleViewBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val mock = CarroMock()

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = CarroListAdapter(mock.listaDeCarros, CarroListAdapter.onClickListener{carro-> Toast.makeText(this,carro.modelo,Toast.LENGTH_SHORT).show()})


    }
}

