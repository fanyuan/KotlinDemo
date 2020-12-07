package com.kotlin.demo.classDemo

class B {
    var a:Int = 0
       get() = field

    var b:Float = 0f
       set(value){field = value}
}

fun main() {
    val b:B = B()
    b.a = 3;
    println("b.a = " + b.a)
    b.b = 2f
    println("b.a = " + b.b)
}