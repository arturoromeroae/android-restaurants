package com.example.restaurantcompose.data.remote

import com.example.restaurantcompose.data.model.Restaurant
import retrofit2.Call
import retrofit2.http.GET

interface RestaurantInterface {
    @GET("restaurants")
    fun getRestaurants(): Call<List<Restaurant>>
}