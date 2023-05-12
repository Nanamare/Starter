package com.nanamare.data.source.remote

import com.nanamare.data.model.TestResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface TestApi {

    @GET("/{status}")
    fun requestTest(@Path("status") status: Int = 200): Call<TestResponse>

}