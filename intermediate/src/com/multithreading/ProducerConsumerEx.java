package com.multithreading;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerEx {
	int capacity = 2;
	List<Integer> list = new LinkedList<Integer>();

	public static void main(String[] args) throws InterruptedException {
		ProducerConsumerEx pc = new ProducerConsumerEx();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				while (list.size() == capacity)
					wait();
				System.out.println("producer produced: " + value);
				list.add(value++);
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (list.size() == 0)
					wait();
				int val = ((LinkedList<Integer>) list).removeFirst();
				System.out.println("consumer consumed: " + val);
				notify();
				Thread.sleep(1000);

			}
		}
	}
}
