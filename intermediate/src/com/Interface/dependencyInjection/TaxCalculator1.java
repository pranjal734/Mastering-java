package com.Interface.dependencyInjection;

public class TaxCalculator1 {
	private double taxableIncome;
public TaxCalculator1(double taxableIncome) {
this.taxableIncome=taxableIncome;
}
public double calculateTax() {
	return taxableIncome*.3;
}
}
