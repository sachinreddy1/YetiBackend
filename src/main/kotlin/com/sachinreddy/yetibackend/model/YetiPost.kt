package com.sachinreddy.yetibackend.model

import java.util.UUID

data class YetiPost(
    val id: UUID,
    val userName: String,
    val numLikes: Int,
    val imageURI: String
)