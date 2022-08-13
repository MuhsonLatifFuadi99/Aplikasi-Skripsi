package com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kecamatan(

    @field:SerializedName("nama_kecamatan")
    val namaKecamatan: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("kabupaten")
    val kabupaten: Kabupaten? = null,

    @field:SerializedName("id_kabupaten")
    val idKabupaten: Int? = null,

    @field:SerializedName("status")
    val status: String? = null
) : Parcelable