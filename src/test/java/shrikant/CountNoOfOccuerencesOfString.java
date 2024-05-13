package shrikant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CountNoOfOccuerencesOfString {
	
	public static void usingHashMapForCharString(String name) {
		char [] charr=name.toCharArray();
		Map<Character,Integer> hmap=new LinkedHashMap<Character,Integer>();
		for (char c : charr) {
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}else {
				hmap.put(c,1);
			}
			
		}
		System.out.println(hmap);

	}
	public static void usingHashMapForArray(String[] name) {
		Map<String,Integer> hmap=new LinkedHashMap<String,Integer>();
		for (String c : name) {
			if(hmap.containsKey(c)) {
				hmap.put(c, hmap.get(c)+1);
			}else {
				hmap.put(c,1);
			}
			
		}
		System.out.println(hmap);

	}

	public static void main(String[] args) {
		usingHashMapForCharString("shrssiiikanttttt");
		String[] courses= {"java","c","python","c"};
		usingHashMapForArray(courses);
	}

}
