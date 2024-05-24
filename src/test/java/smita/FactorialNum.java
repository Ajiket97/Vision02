package smita;

public class FactorialNum {
	public static void isFactorial(int num) {
		int digit = 1;
//		while (num >= 1) {
//			digit = num * digit;
//			num = num - 1;
//
//		}
//		System.out.println("Factorial of given number is : " + digit);
		for (int i = 1; i <= num ; i++) {
			digit = digit*i;	
		}
		System.out.println("Factorial of given number is : " + digit);
	}

	public static void main(String[] args) {
		isFactorial(5);

	}

}
