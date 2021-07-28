package com.diamon;

public class CommonPrinter implements IPrintInk, IprintLaser {

	@Override
	public void printLaser() {
		final LaserPrinter lp = new LaserPrinter();
		lp.printLaser();

	}

	@Override
	public void printInk() {
		InkJetPrinter ij = new InkJetPrinter();
		ij.printInk();

	}

}
