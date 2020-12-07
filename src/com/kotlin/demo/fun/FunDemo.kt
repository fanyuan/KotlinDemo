package com.kotlin.demo.`fun`

fun main() {
    println(sum(2,5))
    println(int2Long(5))
    sayHi("name")
    sayHello("name1")
    val sayHi01 = fun(name:String) = println("Hi $name 01")
    sayHi01("name123")
}
val sum = {arg1:Int,arg2:Int ->
    println("sum $arg1 + $arg2 = ${(arg1 + arg2)}")
    arg1 + arg2
}
val int2Long = fun(x : Int):Long{
    return x.toLong()
}
fun sayHello(name:String){
    println("helle $name")
}
fun sayHi(name:String) = println("hi $name")