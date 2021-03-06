package com.rishav.kotlinpractice.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Rishab on 11/30/2017.
 */
data class Movies (
        @SerializedName("results")
        val results: List<Results>?,

        @SerializedName("page")
        val page: Int?,

        @SerializedName("total_results")
        val totalResults: Int?,

        @SerializedName("dates")
        val dates: Dates?,

        @SerializedName("total_pages")
        val totalPages: Int
)