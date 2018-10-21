package com.sample.sayan.learningkotlin

import retrofit2.Call
import retrofit2.http.GET

interface Service {
    @GET("/bins/q0fag")
    fun getJSON() : Call<JSONResponse>
}