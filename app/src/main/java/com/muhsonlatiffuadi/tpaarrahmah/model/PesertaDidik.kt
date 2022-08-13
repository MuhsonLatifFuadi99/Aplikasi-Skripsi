package com.muhsonlatiffuadi.tpaarrahmah.model

import com.google.gson.annotations.SerializedName
import java.util.*

//Objek <ArrayList> "data"
data class PesertaDidik(

    @field:SerializedName("id")
    val id: Int,
    @field:SerializedName("no_induk")
    val no_induk: String,
    @field:SerializedName("nisn")
    val nisn: String,
    @field:SerializedName("nama_lengkap")
    val nama_lengkap: String,
    @field:SerializedName("nama_panggilan")
    val nama_panggilan: String,
    @field:SerializedName("nik")
    val nik: Int,
    @field:SerializedName("no_kk")
    val no_kk: Int,
    @field:SerializedName("jenkel")
    val jenkel: String,
    @field:SerializedName("tgl_lahir")
    val tgl_lahir: String,
    @field:SerializedName("kewarganegaraan")
    val kewarganegaraan: String,
    @field:SerializedName("jml_saudara_kandung")
    val jml_saudara_kandung: String,
    @field:SerializedName("bhs_sehari_hari")
    val bhs_sehari_hari: String,
    @field:SerializedName("alamat")
    val alamat: String,
    @field:SerializedName("rt")
    val rt: Int,
    @field:SerializedName("rw")
    val rw: Int,
    @field:SerializedName("tgl_masuk")
    val tgl_masuk: Date,
    @field:SerializedName("foto")
    val foto: String,
    @field:SerializedName("status")
    val status: String

)