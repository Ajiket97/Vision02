package Com.collectionprograms;

import java.util.ArrayList;
import java.util.List;

public class FindSublistInTheArr {

	public static void main(String[] args) {
		findSubList();
	}

	public static void findSubList() {
		int ar[] = { 4, 78, 4, 21, 36, 90 };
		List al = new ArrayList();

		for (int i = 0; i < ar.length; i++) {
			al.add(ar[i]);
		}

		System.out.println(al);
		System.out.println(al.subList(3, 5)); // from means including this element and to means excluding for this index num

	}

}
