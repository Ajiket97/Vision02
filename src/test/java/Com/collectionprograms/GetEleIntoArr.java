package Com.collectionprograms;

import java.util.ArrayList;

public class GetEleIntoArr {

	public static void main(String[] args) {
		int arr[] = { 4, 8, 7, 5, 2, 1, 3, 2, 3, 6 };

		ArrayList ar = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			ar.add(arr[i]);
		}
		System.out.println(ar);
		
		System.out.println("Get the value of index: " + ar.get(5));
	}

}
