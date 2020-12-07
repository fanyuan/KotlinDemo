package com.kotlin.demo.varargDemo

fun main() {
    //println("===varargDemo===")
    val r = 0..10
    var array = intArrayOf(1,2,3,4,5)
    hello(2.0,*array)
    var list = arrayListOf<Int>(1,2,3,4,5)
    //hello(3.0,*list)
    hello(2.0,*array,string = "hello world")
    hello(3.0,string = "hello world",ints = *array)
}
fun hello(double:Double,vararg ints:Int,string:String = "hello"){
    println("===hello===")
    println("double = $double")
    ints.forEach {i ->  print(i)}
    println()
    println(string)
}