package com.example.chap03Class.Cl

//주 생성자 선언
class Bird6(var name: String, var wing: Int, var beak: String, var color: String ) {
    //초기화 블록
    init {
        println("------초기화 블록 시작------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("------초기화 블록 끝------")
    }

    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}
fun main() {
    val vovo = Bird6("vovo",2,"long","red")
    println("vovo.name: ${vovo.name}, vovo.wing: ${vovo.wing}")
    println("vovo.color: ${vovo.color}, vovo.beak: ${vovo.beak}")

}