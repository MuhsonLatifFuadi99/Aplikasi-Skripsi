package com.muhsonlatiffuadi.tpaarrahmah.model

import com.google.gson.annotations.SerializedName

data class Pendidik(

    @field:SerializedName("nama_lengkap")
    val nama_lengkap: String,
    @field:SerializedName("nama_panggilan")
    val nama_panggilan: String,
    @field:SerializedName("nik")
    val nik: String,
    @field:SerializedName("no_kk")
    val no_kk: String,
    @field:SerializedName("niup")
    val niup: String,
    @field:SerializedName("niy")
    val niy: String

)