package com.example.mysecondapp.CicloVida

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivitySecondPageBinding

class SecondPage : AppCompatActivity() {
    private val binding by lazy{
        ActivitySecondPageBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnFirstpage.setOnClickListener{
            val intent = Intent(this, FirstPage::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}