package com.example.routecontactapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.routecontactapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        binding.tilName.error= Error_message
        binding.tilPhoneNumber.error= Error_message
    }
    companion object{
         const val Error_message="Required"
    }
}

