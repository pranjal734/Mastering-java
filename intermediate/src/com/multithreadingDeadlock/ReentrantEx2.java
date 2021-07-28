package com.multithreadingDeadlock;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class ReentrantEx2 {
	static Lock lock = new ReentrantLock();
	static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				lock.lock();
				try {
				for (int i = 0; i < 1000; i++) {
					counter++;
				}
			}
				finally {
				lock.unlock();
			}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				lock.lock();
				try {
				for (int i = 0; i < 1000; i++) {
					counter++;
				}
			}
				finally {
				lock.unlock();
			}
			}
		});
		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println("the final value of counter is " + counter);
	}
}
