package com.sample.sayan.learningkotlin

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class JSONResponse(
    @SerializedName("result")
    @Expose
    var result: String?,
    @SerializedName("name")
    @Expose
    var name: List<String>?)