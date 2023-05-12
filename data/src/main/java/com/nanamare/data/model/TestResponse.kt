package com.nanamare.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TestResponse(
    @SerialName("statusCode")
    val statusCode: Int,
    @SerialName("description")
    val description: String
)