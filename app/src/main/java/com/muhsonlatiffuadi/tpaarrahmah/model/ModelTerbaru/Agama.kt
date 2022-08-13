package com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Agama(

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("nama_agama")
    val namaAgama: String? = null,

    @field:SerializedName("status")
    val status: String? = null
) : Parcelable