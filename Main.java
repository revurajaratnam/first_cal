package com.calculatorprojectusingoops;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double firstNum = sc.nextDouble();
		System.out.println("Enter second number: ");
		double secondNum = sc.nextDouble();
		System.out.println("Select the operation: + , - , * , / ");
		char options = sc.next().charAt(0);
		SimpleCalculator scr = new SimpleCalculator();
		switch (options) {
		case '+':
			
			double additionResult = scr.addition(firstNum, secondNum);
			System.out.println("Addition result:" + additionResult);
			break;
		case '-':
			double subtractionResult = scr.subtraction(firstNum, secondNum);
			System.out.println("Subtraction result:" + subtractionResult);
			break;
		case '*':
			double multiplicationResult = scr.multiplication(firstNum, secondNum);
			System.out.println("Multiplication result:" + multiplicationResult);
			break;
		case '/':
			try {
			double divisionResult = scr.division(firstNum, secondNum);
			System.out.println("Division result:" + divisionResult);
			}catch(ArithmeticException e) {
				System.out.println("Error"+e.getMessage());
			
			}
			break;
		default:
			System.out.println("Invalid Operator");
		}

	}

}
