package com.rishav.kotlinpractice.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Rishab on 11/30/2017.
 */
class Dates(

        @SerializedName("maximum")
        val maximum: String?,

        @SerializedName("minimum")
        val minimum: String?

)