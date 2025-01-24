package com.example.routecontactapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.routecontactapp.databinding.ActivityContactDetailsBinding

class ContactDetailsActivity : AppCompatActivity() {
    lateinit var binding:ActivityContactDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}