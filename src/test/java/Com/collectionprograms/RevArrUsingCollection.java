package Com.collectionprograms;

import java.util.ArrayList;
import java.util.Collections;

public class RevArrUsingCollection {

	public static void main(String[] args) {
		revByUsingCollection();

	}

	public static void revByUsingCollection() {
		int num[] = { 4, 8, 9, 5, 12, 36, 4, 5 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			al.add(num[i]);
		}
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
	}

}
