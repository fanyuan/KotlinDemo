package com.kotlin.demo.typeCast;

import com.kotlin.demo.Child;
import com.kotlin.demo.Parent;

public class TypeCast {
	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println(((Child)parent).getName());
	}
}
