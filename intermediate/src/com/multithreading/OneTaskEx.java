package com.multithreading;

public class OneTaskEx implements Runnable {
	@Override
	public void run() {
		System.out.println("one");
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new OneTaskEx());
		Thread t2 = new Thread(new OneTaskEx());
		t1.start();
		t2.start();
	}
}
