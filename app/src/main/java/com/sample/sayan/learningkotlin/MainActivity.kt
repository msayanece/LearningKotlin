package com.sample.sayan.learningkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickTextView(v: View){
        toast("Loading...")
        Sdk.buildRetrofit(this).create(Service::class.java).getJSON().enqueue(object: Callback<JSONResponse>{
            override fun onFailure(call: Call<JSONResponse>, t: Throwable) {
                toast("failed to load")
            }

            override fun onResponse(call: Call<JSONResponse>, response: Response<JSONResponse>) {
                toast("JSON: ${response.body()}")
            }
        })
    }
}
