package com.example.routecontactapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class ContactDataClass(
    val avatarID:Int,
    val name:String,
    val phone_number:String,
    val description:String?
):Parcelable
