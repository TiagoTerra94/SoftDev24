package com.example.mysecondapp.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityConstraintBinding

class Constraint : AppCompatActivity() {
    private val binding by lazy{
        ActivityConstraintBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}