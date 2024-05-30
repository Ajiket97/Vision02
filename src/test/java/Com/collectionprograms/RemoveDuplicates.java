package Com.collectionprograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void removeDuplicate() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(40);
		al.add(20);
		al.add(10);
		al.add(40);
		al.add(50);

		System.out.println("List before removing duplicates: " + al);
		Set<Integer> set = new LinkedHashSet<>(al);
		al.clear();
		al.addAll(set);
		System.out.println("List after removing duplicates: " + al);

	}

	public static void main(String[] args) {
		removeDuplicate();

	}

}
