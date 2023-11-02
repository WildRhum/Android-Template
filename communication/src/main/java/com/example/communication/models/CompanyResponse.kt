package com.example.communication.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CompanyResponse(
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("catchPhrase")
    val catchPhrase: String? = null,
    @SerializedName("bs")
    val bs: String? = null
) : Parcelable