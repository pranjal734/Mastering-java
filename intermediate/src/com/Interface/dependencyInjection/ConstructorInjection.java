package com.Interface.dependencyInjection;

public class ConstructorInjection {
private TaxCalculator calculator;
public ConstructorInjection(TaxCalculator calculator) {
this.calculator=calculator;
}
public void show() {
	tax = calculator.calculateTax();
	System.out.println(tax);
}
}
