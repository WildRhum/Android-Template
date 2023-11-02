package com.example.communication.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class GeoResponse(
    @SerializedName("lat")
    val lat: Float? = null,
    @SerializedName("lng")
    val lng: Float? = null
) : Parcelable