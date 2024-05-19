package Com.Ajit;



public class IterateOverCharacters {
	public static void main(String[] args) {
		String name = "AjitShingnare";
		// System.out.println(name.charAt(5));

		char[] nam = name.toCharArray();
		char[] nam1 = new char[nam.length];
		System.out.print("[ ");

		for (int i = 0; i < nam.length - 1; i++) {

			System.out.print(" " + nam[i]);
			nam[i] = nam1[i];
			System.out.print(nam1[i] + ",");

		}
		System.out.println(" ]");

	}

}
