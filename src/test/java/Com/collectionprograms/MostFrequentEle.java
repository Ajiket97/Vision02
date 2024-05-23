package Com.collectionprograms;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEle {
	public static int mostFreqEle(int[] digit) {
		Map<Integer, Integer> frem = new HashMap<Integer, Integer>();
		for (int num : digit) {
			frem.put(num, frem.getOrDefault(num, 0) + 1);
		}

		int maxCount = 0;
		int mostFreq = -1;

		for (Map.Entry<Integer, Integer> e : frem.entrySet()) {
			if (e.getValue() > maxCount) {
				maxCount = e.getValue();
				mostFreq = e.getKey();
			}
		}
		return mostFreq;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 4, 7, 8, 4, 3, 2, 9, 7, 9, 9, 9, 9, 1 };
		System.out.println("Most frequent element: "+mostFreqEle(arr));
	}
}
