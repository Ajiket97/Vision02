package smita;

import java.util.Scanner;

public class CalLeapYear {

	public static void isLeap(int num) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome to new year calculator\n");
			System.out.print("Please enter the year that you want to check: ");
			int year = sc.nextInt();//2024
                                         
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println("your year is a leap year");
			} else {
				System.out.println("your year is not a leap year");
			}
			
//			if (year % 400 == 0) {
//				System.out.println("your year is a leap year");
//			} else if(year % 4 == 0) {
//				System.out.println("your year is a leap year");
//			} else if(year % 100 != 0) {
//				System.out.println("your year is not a leap year");
//			}
		}
	}

	public static void main(String[] args) {
		isLeap(2022);
	}

}
