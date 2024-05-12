package shrikant;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupCharsFromString {
	public static void usingSet(String str) {
		StringBuffer sb = new StringBuffer();
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character c : set) {
			sb.append(c);
		}
		System.out.println(sb);
	
	}

	public static void main(String[] args) {
		usingSet("Testingggg");
	}

}
