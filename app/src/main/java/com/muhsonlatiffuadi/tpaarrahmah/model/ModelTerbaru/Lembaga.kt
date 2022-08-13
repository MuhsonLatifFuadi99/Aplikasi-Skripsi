package com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Lembaga(

    @field:SerializedName("desa")
    val desa: Desa? = null,

    @field:SerializedName("misi")
    val misi: String? = null,

    @field:SerializedName("tahun")
    val tahun: Int? = null,

    @field:SerializedName("tujuan")
    val tujuan: String? = null,

    @field:SerializedName("alamat")
    val alamat: String? = null,

    @field:SerializedName("id_desa")
    val idDesa: Long? = null,

    @field:SerializedName("sasaran")
    val sasaran: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("no_telp")
    val noTelp: String? = null,

    @field:SerializedName("nama_lembaga")
    val namaLembaga: String? = null,

    @field:SerializedName("email")
    val email: String? = null,

    @field:SerializedName("visi")
    val visi: String? = null,

    @field:SerializedName("status")
    val status: String? = null
) : Parcelable