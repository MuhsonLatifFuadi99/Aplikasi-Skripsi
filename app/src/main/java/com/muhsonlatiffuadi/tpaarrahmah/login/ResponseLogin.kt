package com.muhsonlatiffuadi.tpaarrahmah.login

import com.google.gson.annotations.SerializedName
import com.muhsonlatiffuadi.tpaarrahmah.login.DataLogin

data class ResponseLogin(

    @field:SerializedName("data")
    val data: List<DataLogin>

//    @SerializedName("data") val dataLogin: DataLogin?

//    @SerializedName("status") val status: Boolean,
//    @SerializedName("msg") val msg: String,
//    @SerializedName("pendidik") val pendidik: DataLogin?
)
