package com.example.communication.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class AddressResponse(
    @SerializedName("street")
    val street: String? = null,
    @SerializedName("suite")
    val suite: String? = null,
    @SerializedName("city")
    val city: String? = null,
    @SerializedName("zipcode")
    val zipcode: String? = null,
    @SerializedName("geo")
    val geo: GeoResponse? = null
) : Parcelable