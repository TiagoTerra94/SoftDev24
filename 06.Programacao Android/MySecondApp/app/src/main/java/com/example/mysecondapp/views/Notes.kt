package com.example.mysecondapp.views

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityNotesBinding

class Notes : AppCompatActivity() {
    private val binding by lazy{
        ActivityNotesBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val sharedPreferences = this.getSharedPreferences("note", Context.MODE_PRIVATE)
        val valor = sharedPreferences.getString("note","").toString()

        binding.notesEdit.setText(valor)


        binding.btnGravar.setOnClickListener {
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("note", binding.notesEdit.text.toString())
            editor.apply()
        }

    }

}