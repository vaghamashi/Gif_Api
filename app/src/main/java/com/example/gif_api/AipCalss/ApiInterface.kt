package com.example.api_2

import com.example.gif_api.Modal.GifModal
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("search")
    fun getGif(
        @Query("key") key: String,
        @Query("page") page: String,
        @Query("q") q: String
    ): Call<GifModal>



}