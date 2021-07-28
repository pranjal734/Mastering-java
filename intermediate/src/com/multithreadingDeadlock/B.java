package com.multithreadingDeadlock;

public class B {
	public synchronized void d2(A a) {
		System.out.println("thread start execution of d2 method");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thread 2 is trying to call A's last method");
		a.last();
	}
	public synchronized void last() {
		System.out.println("inside B last method");
	}

}
