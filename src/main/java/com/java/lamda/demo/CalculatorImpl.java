package com.java.lamda.demo;

interface Calculator {

	int substract(int i1, int i2);
}

public class CalculatorImpl  {
	public static void  main(String[] args) {

		Calculator calculator = (i1, i2) -> i2-i1 ;
			
			System.out.println(calculator.substract(8, 20));
		

	}

	
}
