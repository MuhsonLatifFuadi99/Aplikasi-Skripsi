package com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Kabupaten(

    @field:SerializedName("provinsi")
    val provinsi: Provinsi? = null,

    @field:SerializedName("nama_kabupaten")
    val namaKabupaten: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("id_provinsi")
    val idProvinsi: Int? = null,

    @field:SerializedName("status")
    val status: String? = null
) : Parcelable