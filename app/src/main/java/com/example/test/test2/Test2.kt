package com.example.test.test2

    //val data1: Int //오류
    val data2 = 10

    fun someFun(){
        val data3: Int
        //println("data3: $data3") //오류
        data3 = 10
        println("data3: $data3")
    }

    class User {
        //val data4: Int //오류
        val data5: Int = 10
    }

    //lateinit var data1:Int //오류
    //lateinit var data2: String //오류
    lateinit var data5:String

    val data4: Int by lazy {
        println("in lazy......")
        10
    }

    fun main(){
        println("in main......")
        println(data4 + 10)
        println(data4 + 10)
    }