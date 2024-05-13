package smita;
import java.util.Scanner;
public class PalimdromeNum {
	
	public static void isPalimdrome(int num) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int number = sc.nextInt();
			int sum = 0;
			int rem;
			int t = number;
			
			while(number>0) {
				rem = number % 10;
				sum = (sum*10)+rem;
				number = number /10;
			}
			
			if (t == sum) {
				System.out.println("The given number is palindrome");
			} else {
				System.out.println("The given number is not palindrome");
			}
		}
		
	}

	public static void main(String[] args) {
		isPalimdrome(151);

	}

}
