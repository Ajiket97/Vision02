package shrikant;


public class LongestWordInstring {

	public static void printLongWord(String s) {
		String[] words = s.split(" ");
		String longestWord = "";
		int maxLength = 0;
		for (String word : words) {
			if (word.length() > maxLength) {//my,//name
				maxLength = word.length();
				longestWord = word;
			}

		}
		System.out.println(longestWord);

	}

	public static void main(String[] args) {
		LongestWordInstring.printLongWord("Mygfgjki name is Shrikant ");
	}
}
