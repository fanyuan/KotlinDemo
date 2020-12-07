package com.kotlin.demo.classDemo.operatorDemo

class Complex (var real:Double,var imaginary:Double){
    operator fun plus(other:Complex):Complex{
        return Complex(real + other.real,imaginary + other.imaginary);
    }

    override fun toString(): String {
        return "$real === $imaginary"
    }
}

fun main() {
    var c1:Complex = Complex(1.0,2.0);
    val c2:Complex = Complex(3.0,4.0)
    var c3 = c1 + c2;
    println(c3)
    c2.imaginary = 5.0
    c1 = Complex(5.0,6.0)
    println(c1)
}