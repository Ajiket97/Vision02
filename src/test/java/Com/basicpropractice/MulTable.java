package Com.basicpropractice;

import java.util.Scanner;

public class MulTable {

	public static void isMultiplicationTable(int number) {
		int i = 1;
		while (i <= 10) {
			System.out.println(number + "x" + i + "=" + (number * i));
			i++;	
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the multiplication world\n");
		System.out.print("Please enter the number: ");
		int number = sc.nextInt();
		isMultiplicationTable(number);
	}

}
