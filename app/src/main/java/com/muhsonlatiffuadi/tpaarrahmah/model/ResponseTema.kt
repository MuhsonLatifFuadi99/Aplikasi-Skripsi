package com.muhsonlatiffuadi.tpaarrahmah.model

import com.google.gson.annotations.SerializedName

data class ResponseTema(

    @field:SerializedName("id")
    val id: Int,
    @field:SerializedName("nama_tema")
    val nama_tema: String,
    @field:SerializedName("status")
    val status: String

)