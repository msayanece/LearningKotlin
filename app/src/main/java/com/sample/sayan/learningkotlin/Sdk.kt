package com.sample.sayan.learningkotlin

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Sdk {
    companion object {
        fun buildRetrofit(context: Context):Retrofit {
            return Retrofit.Builder().baseUrl(context.resources.getString(R.string.baseUrl)).addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}