package com.example.whatcomapp.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.GET

private const val BASE_URL = "localhost:8000/services"
private val retrofit = Retrofit.Builder().addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL).build()

interface WhatcomApiService {
    @GET("CSV")
    suspend fun getCSV() : String
}

object WhatcomApi {
    val retrofitInit : WhatcomApiService by lazy {
        retrofit.create(WhatcomApiService::class.java)
    }
}