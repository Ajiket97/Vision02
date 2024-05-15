package Com.Ajit;

public class StringPalindromProgram {
	public static void verifyStringisPalindromOrNot(String name) {

		char[] arr = name.toCharArray();
		String rev = "";
		for (int i = arr.length - 1; 0 <= i; i--) {
			rev = rev + arr[i];

		}
		if (name.equals(rev)) {
			System.out.println(rev + "-" + "String is palindrom");
		} else {
			System.out.println(rev + " string is not palindrom");
		}
	}

	public static void main(String[] args) {
		verifyStringisPalindromOrNot("nayan");
	}
}
