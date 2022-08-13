package com.muhsonlatiffuadi.tpaarrahmah.api

import com.muhsonlatiffuadi.tpaarrahmah.model.ModelTerbaru.ResponsePesertaDidik
import com.muhsonlatiffuadi.tpaarrahmah.model.PesertaDidikResponse
import com.muhsonlatiffuadi.tpaarrahmah.model.ResponseTema

import retrofit2.Call
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET

interface Api {

    @GET("peserta-didik")
    fun getPesertaDidik(
    ): Call<ResponsePesertaDidik>

    //satu data
    @FormUrlEncoded
    //banyak data
//  @Multipart
    @GET("tema")
    fun createTema(

    ) : Call<ResponseTema>


//    @GET("subtema")
//    fun Subtema(
//        @Field("nama_subtema") nama_subtema: String,
//        @Field("status") status: String
//    ): Call<ResponseSubtema>
}


//    @FormUrlEncoded
//    @POST("pendidik")
//    fun loginGuru(
//        @Field("username") username: String,
//        @Field("password") password: String,
//        ): Call<ResponseLogin>
//}

//interface Api {
//    @GET("pendidik")
//    fun getPendidik(): Call<PostResponse>
//
//}