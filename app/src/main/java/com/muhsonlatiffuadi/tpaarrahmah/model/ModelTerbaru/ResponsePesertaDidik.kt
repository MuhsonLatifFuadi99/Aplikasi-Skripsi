package com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponsePesertaDidik(

    @field:SerializedName("data")
    val data: ArrayList<DataItem>
) : Parcelable