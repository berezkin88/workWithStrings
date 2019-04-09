package com.javaTask;

public class AppRunner {

	public static void main(String[] args) {
		doMultAndPrint(1234, 123);
	}

	public static void doMultAndPrint(Integer num1, Integer num2) {
		Integer result = num1 * num2;
		
		print(num1, num2, result);
	}

	private static void print(Integer num1, Integer num2, Integer result) {
		// finding numbers lengths
		int spaces = result.toString().length();
		int num1len = num1.toString().length();
		int num2len = num2.toString().length();
		
		// printing conditions
		System.out.print(printSpaces(spaces, num1len) + num1 + "\n");
		System.out.print(printSpaces(spaces, num2len) + num2 + "\n");
		System.out.print(printSpaces(spaces, (num1 >= num2 ? num1len : num2len)) 
				+ printLine(num1 >= num2 ? num1len : num2len) + "\n");
		
		// printing calculations
		for (int i = 0; i < num2len; i++) {
			Integer number = num1 * (num2 % 10);
			num2 /= 10;
			
			System.out.print(printSpaces(spaces, (number.toString().length() + i)) + number + "\n");
		}
		
		// printing results
		System.out.print(printLine(spaces) + "\n");
		System.out.print(result);
	}

	private static String printLine(int length) {
		String sp = "";
		
		for(int i = 0; i < length; i++) {
			sp += "_";
		}
		
		return sp;
	}

	private static String printSpaces(int spaces, int length) {
		String sp = "";
		
		for(int i = 0; i < (spaces - length); i++) {
			sp += " ";
		}
		
		return sp;
	}
}
