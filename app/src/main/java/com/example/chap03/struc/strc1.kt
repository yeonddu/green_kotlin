package com.example.chap03.struc

fun main() {
    var list = listOf<Int>(10, 20, 30)
    println(
        """
           list size: ${list.size} 
           list data : ${list[0]}, ${list.get(1)}, ${list.get(2)}
        """
    )

}