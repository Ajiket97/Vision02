package Com.Ajit;



import java.util.Scanner;

public class IsprimeNumber {
	public static void isPrimeNumber(int num) {
		//int number;
		for (int i =2; i<=num; i++) {
			int temp=0;
			boolean flag;
			for (int j = 2; j <i; j++) {
				if (i % j == 0) {
					temp++;
					

				}

			}
			if(temp==0) {
				System.out.println(i);
			}

		}
	}
	public static  void thenumPrimeOrNot(int num) {
		int temp = 0;

		
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				temp++;
			
			}

			}
		if (temp == 0) {
			System.out.println(num+" is  prime");
		} else {
			System.out.println(num +" is nort prme");
				
		}

	}
	public static void main(String[] args) {
		//isPrimeNumber(2000);
		thenumPrimeOrNot(4);
	

	}
}