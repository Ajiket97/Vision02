package Com.collectionprograms;

import java.util.Arrays;

import java.util.List;

public class ArrayToListConvet {

	public static void main(String[] args) {

		String actor[] = { "Rashmika", "Alia", "Priyanka", "Katrina", "Kiyara" };
		List<String> li = Arrays.asList(actor);

		System.out.println("Array to list Conversation: " + li);
		String ar[] = li.toArray(new String[0]);
		System.out.println("=======================================");

		System.out.println("List to Array Conversation ");
		for (int i = 0; i < ar.length; i++) {
			String name = ar[i];
			System.out.println(name);
		}

	}

}
