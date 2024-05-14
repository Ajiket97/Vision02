package Com.Ajit;

public class FactorialProgram {
	private static void isFactorial(int num) {
		int factorial = 1;
		while (num > 1) {
			factorial = num * factorial;

			num--;

		}
		System.out.println(factorial);

	}

	public static void main(String[] args) {
		isFactorial(6);
	}

}
