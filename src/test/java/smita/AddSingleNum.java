package smita;

import java.util.Scanner;

public class AddSingleNum {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = scanner.nextInt();

			int singleDigitSum = calculateSingleDigitSum(number);

			System.out.println("Single digit sum of " + number + " is: " + singleDigitSum);
		}
	}

	public static int calculateSingleDigitSum(int number) {
		int sum = 0;
		while (number > 0 || sum > 9) {
			System.out.println("Current number: " + number + ", Current sum: " + sum);
			if (number == 0) {
				number = sum;
				sum = 0;
			}
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println("Final number: " + number + ", Final sum: " + sum);
		return sum;
	}

}
