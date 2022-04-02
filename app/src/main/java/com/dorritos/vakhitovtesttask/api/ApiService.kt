package com.dorritos.vakhitovtesttask.api

import com.dorritos.vakhitovtesttask.api.models.Food
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    companion object {
        const val SEARCH_FOOD = "food/menuItems/search"
    }

    @GET(SEARCH_FOOD)
    suspend fun getFood(
        @Query("query") query: String,
        @Query("number") number: Int,
        @Query("apiKey") apiKey: String
    ): Food

}