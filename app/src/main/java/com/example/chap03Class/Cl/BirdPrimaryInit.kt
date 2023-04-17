package com.example.chap03Class.Cl

//주 생성자 선언
class Bird7(var name: String, var wing: Int, var beak: String, var color: String){

    //프로퍼티

    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
fun main() {
    val vovo = Bird7("vovo",11,"long","orange")
    println("vovo.name: ${vovo.name}, vovo.wing: ${vovo.wing}")
    println("vovo.color: ${vovo.color}, vovo.beak: ${vovo.beak}")
}