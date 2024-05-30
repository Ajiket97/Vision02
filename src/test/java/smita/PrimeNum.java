package smita;

public class PrimeNum {
	public static void isPrime(int num) {
		for (int i = 2; i <= num; i++) {
			int temp = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					temp++;
				}
			}
			if (temp == 0) {
				System.out.println(i);
			}

		}
	}

	public static void isPrimeNumOrNot(int num) {
		int temp = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp++;
			}
		}
		if (temp == 0) {
			System.out.println("This number is prime: " + num);
		} else {
			System.out.println("This number is not a prime: " + num);
		}
	}

	public static void main(String[] args) {
		// isPrime(100);
		isPrimeNumOrNot(10);
	}
}
