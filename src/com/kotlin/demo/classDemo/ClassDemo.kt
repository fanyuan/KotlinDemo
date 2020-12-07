package com.kotlin.demo.classDemo

class X

class A{
    var b:Int = 0
    lateinit var c:String
    lateinit var d:X
    val e:X by lazy {
        println("class A init X")
        X()
    }
    var cc:String? = null
}

fun main() {
    println("---start-----")
    val a:A = A()
    println("init a")
    println("a.b = " + a.b)
    println("a.e = " + a.e)

    a.d = X()
    println(a.d)

    a.c = "ccccccc"
    println(a.c)

    println(a.cc?.length)
    println(a.cc?.length == null)
}