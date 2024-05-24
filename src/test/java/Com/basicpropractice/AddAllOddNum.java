package Com.basicpropractice;

import java.util.Scanner;

public class AddAllOddNum {

	public static int addAllOddNum(int num) {
		int i = 1;
		int sum = 0;
		while(i <= num) {
			sum += i;
			i += 2;
					
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to odd numbers's sum");
		System.out.println("Please enter the number: ");
		int num = sc.nextInt();
		int sum = addAllOddNum(num);
		System.out.println("Oddsum till " + num + " is: " + sum );
		
	}

}
