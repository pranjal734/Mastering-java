package com.basics;

public class Outer {
	class Inner {
		void display() {
			System.out.println("i m in inner class");
		}
	}

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner iner = out.new Inner();
		iner.display();

	}

}
