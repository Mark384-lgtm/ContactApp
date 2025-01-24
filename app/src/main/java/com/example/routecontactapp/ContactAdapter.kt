package com.example.routecontactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.routecontactapp.databinding.ItemContactBinding

class ContactAdapter(val contactList: MutableList<ContactDataClass>)
    :Adapter<ContactAdapter.ContactViewHolder>() {
    class ContactViewHolder(val binding:ItemContactBinding):ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding=ItemContactBinding.inflate(LayoutInflater.from(parent.context),
            parent,false)
        return ContactViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.binding.ivPerson.setImageResource(contactList[position].avatarID)
        holder.binding.tvName.text=contactList[position].name
        holder.binding.tvPhonenumber.text= contactList[position].phone_number
    }
    

    override fun getItemCount(): Int =contactList.size
}