package com.example.communication.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class AlbumResponse @JsonCreator constructor(
    @JsonProperty("userId")
    val userId: Int? = null,
    @JsonProperty("id")
    val id: Int? = null,
    @JsonProperty("title")
    val title: String? = null
)