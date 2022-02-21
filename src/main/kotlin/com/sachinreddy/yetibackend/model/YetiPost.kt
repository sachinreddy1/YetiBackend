package com.sachinreddy.yetibackend.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.UUID

data class YetiPost(
    @JsonProperty("id")
    val id: UUID?,

    @JsonProperty("userName")
    val userName: String,

    @JsonProperty("numLikes")
    val numLikes: Int,

    @JsonProperty("imageURI")
    val imageURI: String
)