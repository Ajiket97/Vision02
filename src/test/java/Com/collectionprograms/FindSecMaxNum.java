package Com.collectionprograms;

import java.util.TreeSet;

public class FindSecMaxNum {

	public static void main(String[] args) {
		int arr[] = { 5, 9, 5, 4, 2, 3, 8, 7, 9 };
		TreeSet<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		System.out.println(set.headSet(set.last()).last());
		System.out.println(set.remove(set.first()));
		System.out.println(set.first());

	}

}
