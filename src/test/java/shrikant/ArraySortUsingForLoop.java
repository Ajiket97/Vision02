package shrikant;

public class ArraySortUsingForLoop {

	public static void main(String[] args) {
		int x[] = { 10, 7, 10, 1, 15, 2, 3 };
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		for (int i : x) {
			System.out.println(i);
		}
	}
}
