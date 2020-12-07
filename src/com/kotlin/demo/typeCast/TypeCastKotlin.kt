package com.kotlin.demo.typeCast

import com.kotlin.demo.Parent
import com.kotlin.demo.Child

fun main(args: Array<String>) {
	val parent:Parent = Parent()
	println("main123456")
	val child:Child? = parent as? Child;
	println("child = " + child)
	
	
	println("main123456789")
	
}