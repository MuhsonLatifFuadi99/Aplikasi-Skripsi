package com.muhsonlatiffuadi.tpaarrahmah.model

import com.google.gson.annotations.SerializedName


//data class PostResponse(
//    @field:SerializedName("data")
//    val data: List<Lembaga>
//
//)

//Objek "data"

data class PesertaDidikResponse(
    @field:SerializedName("data")
    val data: ArrayList<PesertaDidik>

)