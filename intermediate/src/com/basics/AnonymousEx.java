package com.basics;

public class AnonymousEx {
public static void main(String[] args) {
	Anony obj = new Anony() {
		
		@Override
		public void show() {
System.out.println("im from anony interface");			
		}
	};
}
}
