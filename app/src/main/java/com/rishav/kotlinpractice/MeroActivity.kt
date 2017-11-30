package com.rishav.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.rishav.kotlinpractice.model.Movies
import com.rishav.kotlinpractice.network.RetrofitHelper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MeroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mero)

        doCall()
    }

    //API Call
    private fun doCall(){
        val retrofitHelper = RetrofitHelper()   // RetrofitHelper() ko instance banako

        val moviesCall = retrofitHelper.getApiService().getMovieList()
        moviesCall.enqueue(object : Callback<Movies>{
            override fun onResponse(call: Call<Movies>, response: Response<Movies>) {
                if (response.isSuccessful){
                    val movies = response.body()
                    if (movies != null && movies.results != null) {
                        Log.d("XaisTitle", movies.results[0].title)
                    }
                }
            }

            override fun onFailure(call: Call<Movies>, t: Throwable) {
                Toast.makeText(this@MeroActivity, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }

}
