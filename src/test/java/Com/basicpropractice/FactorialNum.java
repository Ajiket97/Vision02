package Com.basicpropractice;

import java.util.Scanner;

public class FactorialNum {
	public static long findFact(int num) {
		if (num < 2) {
			return 1;
		}
		long number = 1;
		for (int i = 1; i <= num; i++) {
			number = number * i;
		}
		return number;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		long number = findFact(num);
		System.out.println("Find the factorial of a given number: " + number);
	}

}
