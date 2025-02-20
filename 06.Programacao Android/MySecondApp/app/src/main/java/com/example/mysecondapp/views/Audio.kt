package com.example.mysecondapp.views

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.R
import com.example.mysecondapp.databinding.ActivityAudioBinding

class Audio : AppCompatActivity() {
    private val binding by lazy{
        ActivityAudioBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.btnAudio1.setOnClickListener {
            val MediaPlayer = MediaPlayer.create(applicationContext, R.raw.audio1)
            MediaPlayer.start()
        }

        binding.btnAudio2.setOnClickListener {
            val MediaPlayer = MediaPlayer.create(applicationContext, R.raw.audio2)
            MediaPlayer.start()
        }


    }
}