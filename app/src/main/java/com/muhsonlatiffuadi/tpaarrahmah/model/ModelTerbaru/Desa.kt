package com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Desa(

    @field:SerializedName("id_kecamatan")
    val idKecamatan: Int? = null,

    @field:SerializedName("nama_desa")
    val namaDesa: String? = null,

    @field:SerializedName("kecamatan")
    val kecamatan: Kecamatan? = null,

    @field:SerializedName("id")
    val id: Long? = null,

    @field:SerializedName("status")
    val status: String? = null
) : Parcelable