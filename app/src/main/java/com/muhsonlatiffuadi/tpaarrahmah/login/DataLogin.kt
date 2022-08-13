package com.muhsonlatiffuadi.tpaarrahmah.login

import com.google.gson.annotations.SerializedName

data class DataLogin (

    @field:SerializedName("nama_lengkap") val nama_lengkap: String?,
    @field:SerializedName("nama_panggilan") val nama_panggilan: String?,
    @field:SerializedName("nik") val nik: String?,
    @field:SerializedName("no_kk") val no_kk: String?,
    @field:SerializedName("niup") val niup: String?,
    @field:SerializedName("niy") val niy: String?,
    @field:SerializedName("npwp") val npwp: String?,
    @field:SerializedName("tgl_lahir") val tgl_lahir: String?,
    @field:SerializedName("jenkel") val jenkel: String?,
    @field:SerializedName("alamat") val alamat: String?,
    @field:SerializedName("rt") val rt: String?,
    @field:SerializedName("rw") val rw: String?,
    @field:SerializedName("no_telp") val no_telp: String?,
    @field:SerializedName("email") val email: String?,
    @field:SerializedName("pendidikan_terakhir") val pendidikan_terakhir: String?,
    @field:SerializedName("username") val username: String?,
    @field:SerializedName("password") val password: String?,
    @field:SerializedName("status") val status: String?


)