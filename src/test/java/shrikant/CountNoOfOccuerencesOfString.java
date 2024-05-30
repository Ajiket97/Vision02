package shrikant;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class CountNoOfOccuerencesOfString {

	public static void usingHashMapForCharString(String name) {
		char[] charr = name.toCharArray();

		


		Map<Character, Integer> hmap = new LinkedHashMap<Character, Integer>();
		for (char c : charr) {
			if (hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c) + 1);

			}

			else {
				hmap.put(c, 1);
			}

		}
		Iterator it = hmap.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry set = (Map.Entry) it.next();
			System.out.println(set.getKey() + " = " + set.getValue());
		}
		//System.out.println(hmap);
	TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
	
		


			} else {
				hmap.put(c, 1);
			}

		}
		System.out.println(hmap);

		char maxChar = 0;
		int maxCount = 0;

		for (Entry<Character, Integer> e : hmap.entrySet()) {
			if (e.getValue() > maxCount) {
				maxChar = e.getKey();
				maxCount = e.getValue();
			}
		}

		System.out.println(maxChar + " ==> " + maxCount);

	}

//	public static void usingHashMapForArray(String[] name) {
//		Map<String, Integer> hmap = new LinkedHashMap<String, Integer>();
//		for (String c : name) {
//			if (hmap.containsKey(c)) {
//				hmap.put(c, hmap.get(c) + 1);




//			} else {
//				hmap.put(c, 1);
//			}
//
//		}
//		System.out.println(hmap);
//
//	}

	public static void main(String[] args) {
		usingHashMapForCharString("shrssiiikanttttt");


		usingHashMapForCharString("smitakailaspawar");
		usingHashMapForCharString("vfshkergfqkwfhanbskhvabdfkwhfv");

//		String[] courses = { "java", "c", "python", "c" };
//		usingHashMapForArray(courses);
	}

}
