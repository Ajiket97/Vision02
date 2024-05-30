package smita;

public class PalimdromeStr {
	public static void isPalimdromeStrOrNot(String name) {
		String rev = "";
		char[] arr = name.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			rev = rev + arr[i];
		}
		if (name.equals(rev)) {
			System.out.println("String is palimdrome: " + rev);
		} else {
			System.out.println("String is not palimdrome: " + rev);
		}
	}

	public static void main(String[] args) {
		isPalimdromeStrOrNot("naman");

	}

}
