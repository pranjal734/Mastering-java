package com.multithreading;

public class OneTaskEx2 extends Thread {
@Override
public void run() {
	System.out.println("one");
	super.run();
}
public static void main(String[] args) {
	OneTaskEx2 t1 = new OneTaskEx2();
	OneTaskEx2 t2 = new OneTaskEx2();
	t1.start();
	t2.start();
}
}
