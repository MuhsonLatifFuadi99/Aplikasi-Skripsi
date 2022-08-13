package com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataItem(

    @field:SerializedName("rt")
    val rt: Int,

    @field:SerializedName("id_agama")
    val idAgama: Int,

    @field:SerializedName("rw")
    val rw: Int,

    @field:SerializedName("lembaga")
    val lembaga: Lembaga,

    @field:SerializedName("nama_lengkap")
    var namaLengkap: String,

    @field:SerializedName("agama")
    val agama: Agama,

    @field:SerializedName("tgl_masuk")
    val tglMasuk: String,

    @field:SerializedName("id_desa")
    val idDesa: Long,

    @field:SerializedName("nik")
    val nik: String,

    @field:SerializedName("id")
    var id: Int,

    @field:SerializedName("no_induk")
    val noInduk: String,

    @field:SerializedName("nama_panggilan")
    val namaPanggilan: String,

    @field:SerializedName("id_lembaga")
    val idLembaga: Int,

    @field:SerializedName("no_kk")
    val noKk: String,

    @field:SerializedName("jml_saudara_tiri")
    val jmlSaudaraTiri: Int,

    @field:SerializedName("desa")
    val desa: Desa,

    @field:SerializedName("nisn")
    val nisn: String,

    @field:SerializedName("jml_saudara_kandung")
    val jmlSaudaraKandung: Int,

    @field:SerializedName("tgl_lahir")
    val tglLahir: String,

    @field:SerializedName("bhs_sehari_hari")
    val bhsSehariHari: String,

    @field:SerializedName("alamat")
    val alamat: String,

    @field:SerializedName("kewarganegaraan")
    val kewarganegaraan: String,

    @field:SerializedName("foto")
    val foto: String,

    @field:SerializedName("jenkel")
    val jenkel: String,

    @field:SerializedName("status")
    val status: String
) : Parcelable