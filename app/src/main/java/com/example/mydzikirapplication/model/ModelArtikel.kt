package com.example.mydzikirapplication.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ModelArtikel(val image: Int, val title: String,  val desc: String): Parcelable
