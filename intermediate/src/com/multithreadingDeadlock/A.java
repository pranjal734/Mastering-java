package com.multithreadingDeadlock;

public class A {
public synchronized void d1(B b) {

	System.out.println("thread start execution of d1 method");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("thread 1 is trying to call B's last method");
	b.last();
}
public synchronized void last() {
	System.out.println("inside A last method");
}
}
