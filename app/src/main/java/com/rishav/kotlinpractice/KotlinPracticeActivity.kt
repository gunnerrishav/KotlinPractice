package com.rishav.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import kotlinx.android.synthetic.main.activity_kotlin_practice.*

class KotlinPracticeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_practice)

//        val result = sum(10,20)
//        Log.e("result", result)

    }

    fun sum(a: Int, b: Int) : Int {
        return a+b
//        val a = 10
//        val b = 10
//        val result = a+b
//        Log.e("result", result)
    }

//    fun sub (a: Int, b: Int) : Unit{
//        val a = 10
//        val b = 20
//        println("sub is ${a-b}")
//    }
}

