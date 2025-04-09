package com.example.localgemexplorer

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Place(
    val name: String,
    val description: String,
    val imageUrl: String? = null,
    val detailedInfo: String? = null
) : Parcelable