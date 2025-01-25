package com.example.routecontactapp

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.routecontactapp.databinding.ActivityContactDetailsBinding

class ContactDetailsActivity : AppCompatActivity() {
    lateinit var binding:ActivityContactDetailsBinding
    var contact:ContactDataClass?=null
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityContactDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtraContact()
        viewbinding()
        addbackBtnLogic()

    }

    private fun addbackBtnLogic() {
        binding.backBtn.setOnClickListener{finish()}
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun getExtraContact() {
        contact=intent.getParcelableExtra(Extra_contatct,ContactDataClass::class.java)
    }

    private fun viewbinding() {
        binding.ivAvatar.setImageResource(contact?.avatarID !!)
        binding.tvName.text=contact?.name.toString()
        binding.tvPhonenumber.text=contact?.phone_number.toString()
        binding.tvDescription.text=contact?.description.toString()
    }


    companion object{
        val Extra_position="position"
        val Extra_contatct="contact"
    }
}