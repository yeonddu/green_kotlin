package com.example.chap03.param

fun main(args:Array<String>) {
    namedParam(x = 200, z = 100)
    namedParam(z = 150)
}

fun namedParam(x: Int = 100, y: Int = 200, z: Int){
    println(x+y+z)
}