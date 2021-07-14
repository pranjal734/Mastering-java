package com.multithreadingDeadlock;

public class DeadLockEx extends Thread {
A a = new A();
B b = new B();

public void m1() {
	this.start();
	a.d1(b);
}
public void run() {
	b.d2(a);
}
public static void main(String[] args) {
	DeadLockEx t = new DeadLockEx();
	t.m1();
	
}
}
