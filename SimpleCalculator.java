package com.calculatorprojectusingoops;

public class SimpleCalculator implements Calculator {

	@Override
	public double addition(double a, double b) {

		return a + b;
	}

	@Override
	public double subtraction(double a, double b) {

		return a - b;
	}

	@Override
	public double multiplication(double a, double b) {

		return a * b;
	}

	@Override
	public double division(double a, double b) {
		double result = 0;
		if (b == 0) {
			System.out.println("zero not divided");
		} else {
			result = a / b;
		}
		return result;
	}

}
