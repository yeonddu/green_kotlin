package com.example.chap05

//a,b,c,d,e 접근 가능
open class Base2 {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4 //public(기본값)

    //a,b,c,d,e,f, 접근 가능
    protected class Nested {
        public val e: Int = 5
        private val f: Int = 6
    }
}
//b,c,d,e 접근 가능
class Derived2: Base2() {
    override val b = 5
}

//c,d 접근 가능
class Other2(bese: Base2) {

}