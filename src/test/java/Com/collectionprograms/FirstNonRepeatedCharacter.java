package Com.collectionprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	public static char firstNonRepeatedCharacter(String str) {
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("No non-repeated character found");
	}

	public static void main(String[] args) {
		System.out.println("First non-repeated character: " + firstNonRepeatedCharacter("swiss"));
	}
}
