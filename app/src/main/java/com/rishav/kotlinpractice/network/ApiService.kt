package com.rishav.kotlinpractice.network

import com.rishav.kotlinpractice.model.Movies
import com.rishav.kotlinpractice.utils.ApiConstants
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Rishab on 11/30/2017.
 */
interface ApiService {

    @GET(ApiConstants.movieList)
    fun getMovieList(): Call<Movies>

}