package com.example.mysecondapp.FullScreen

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.ActivityInfo
import android.os.BatteryManager
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mysecondapp.databinding.ActivityFullscreenBinding

class FullscreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFullscreenBinding
    private var isChecked = true

    val bateriaReceiver: BroadcastReceiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            if (intent != null){
                val nivel: Int = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,0)
                binding.textNivelBateria.text = nivel.toString()
                Toast.makeText(applicationContext, nivel.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFullscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }else{
            window.addFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE)

        registerReceiver(bateriaReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))

        binding.checkNivelBateria.setOnClickListener{
            if(isChecked){
                isChecked = false
                binding.textNivelBateria.visibility = View.GONE
            }else{
                isChecked = true
                binding.textNivelBateria.visibility = View.VISIBLE
            }
        }

        binding.imagePreferencias.setOnClickListener {
            binding.layoutMenu.visibility = View.VISIBLE
            binding.layoutMenu.animate().translationY(0F).setDuration(
                resources.getInteger(android.R.integer.config_mediumAnimTime).toLong()
            )
        }

        binding.imageViewFechar.setOnClickListener {
            binding.layoutMenu.animate().translationY(binding.layoutMenu.measuredHeight.toFloat()).setDuration(
                resources.getInteger(android.R.integer.config_mediumAnimTime).toLong()
            )
        }

    }
}