package com.javaTask;

public class AppRunner {

	public static void main(String[] args) {
		System.out.print(doMultAndPrint(1234, 123));
	}

	public static String doMultAndPrint(Integer num1, Integer num2) {
		Integer result = num1 * num2;

		return print(num1, num2, result);
	}

	private static String print(Integer num1, Integer num2, Integer result) {
		StringBuffer output = new StringBuffer();
		
		// finding numbers lengths
		int spaces = result.toString().length();
		int num1len = num1.toString().length();
		int num2len = num2.toString().length();

		// printing conditions
		output.append(printSpaces(spaces, num1len) + num1 + "\n");
		output.append(printSpaces(spaces, num2len) + num2 + "\n");
		
		// printing calculations
		if (num2len > 1) {
			output.append(printSpaces(spaces, (num1 >= num2 ? num1len : num2len))
					+ printLine(num1 >= num2 ? num1len : num2len) + "\n");

			for (int i = 0; i < num2len; i++) {
				Integer number = num1 * (num2 % 10);
				num2 /= 10;

				output.append(printSpaces(spaces, (number.toString().length() + i)) + number + "\n");
			}
		}

		// printing results
		output.append(printLine(spaces) + "\n");
		output.append(result);
		
		return output.toString();
	}

	private static String printLine(int length) {
		String sp = "";

		for (int i = 0; i < length; i++) {
			sp += "_";
		}

		return sp;
	}

	private static String printSpaces(int spaces, int length) {
		String sp = "";

		for (int i = 0; i < (spaces - length); i++) {
			sp += " ";
		}

		return sp;
	}
}
