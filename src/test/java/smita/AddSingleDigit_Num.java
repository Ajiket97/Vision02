package smita;

import java.util.Scanner;

public class AddSingleDigit_Num {

	public static void addSingleDigitNum(int num) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			int sum = 0;
			int originalNum = number;
			
			while(number != 0) {
				int rem = number % 10;
				sum = sum+rem;
				number = number/10;
			}
			System.out.println("sum of digit of " + originalNum + " " + "is: " + sum);
		}
	}

	public static void main(String[] args) {
		addSingleDigitNum(287);
	}

}
