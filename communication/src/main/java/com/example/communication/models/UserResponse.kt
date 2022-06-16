package com.example.communication.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class UserResponse @JsonCreator constructor(
    @JsonProperty("id")
    val userId: Int? = null,
    @JsonProperty("name")
    val name: String? = null,
    @JsonProperty("username")
    val username: String? = null,
    @JsonProperty("email")
    val email: String? = null,
    @JsonProperty("address")
    val address: AddressResponse? = null,
    @JsonProperty("phone")
    val phone: String? = null,
    @JsonProperty("website")
    val website: String? = null,
    @JsonProperty("company")
    val company: CompanyResponse? = null
)