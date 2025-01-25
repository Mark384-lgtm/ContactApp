package com.example.routecontactapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.routecontactapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter:ContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
        binding.rvContacts.adapter=adapter
    }

    private fun initViews() {
        adapter=ContactAdapter(mutableListOf())
        binding.btnSave.setOnClickListener{it-> addSaveBtnLogic()}
    }

    private fun addSaveBtnLogic() {
        var validationName:Boolean=false
        var validationPhoneNumber:Boolean=false
        if(binding.tilName.editText?.text?.length==0){
            binding.tilName.error= Error_message1
        }else if(binding.tilName.editText?.text?.length!! in 1..2){
            binding.tilName.error= Error_message2
        } else{
            binding.tilName.error=null
            validationName=true
        }

        if(binding.tilPhoneNumber.editText?.text?.isEmpty() == true){
            binding.tilPhoneNumber.error= Error_message1
        }else if(binding.tilPhoneNumber.editText?.text?.length!! <11){
            binding.tilPhoneNumber.error= Error_message1
        }
        else{
            binding.tilPhoneNumber.error=null
            validationPhoneNumber=true
        }

        if(validationName && validationPhoneNumber){
            val contact=ContactDataClass(
                avatarID = R.drawable.person,
                name = binding.tilName.editText?.text.toString(),
                phone_number = binding.tilPhoneNumber.editText?.text.toString(),
                description = binding.tilDescription.editText?.text.toString()
            )
            adapter.contactList.add(contact)
            adapter.notifyItemInserted(adapter.contactList.size-1)

            binding.tilName.editText?.text?.clear()
            binding.tilPhoneNumber.editText?.text?.clear()
            binding.tilDescription.editText?.text?.clear()
        }

    }

    companion object{
         const val Error_message1="Required"
        const val Error_message2="Name must be of 3 char or more"
    }
}

