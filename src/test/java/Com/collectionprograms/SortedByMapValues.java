package Com.collectionprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortedByMapValues {

	public static void sortedValuesByMap() {
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("S", 9);
//		map.put("K", 1);
//		map.put("R", 0);
//		map.put("M", 7);
//		map.put("T", 2);
//
//		System.out.println(map);
//
//		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
//		list.sort(Map.Entry.comparingByValue());
//
//		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
//		for (Map.Entry<String, Integer> entry : list) {
//			sortedMap.put(entry.getKey(), entry.getValue());
//		}
//		System.out.println(sortedMap);
		System.out.println("========== Using another solution==================");
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("S", 9);
		map.put("K", 1);
		map.put("R", 0);
		map.put("M", 7);
		map.put("T", 2);
		System.out.println("before sorting : " + map);
		map.forEach((k, v) -> System.out.println("key" + k + "=>" + "value" + v));

		List<Map.Entry<String, Integer>> li = new ArrayList<Entry<String, Integer>>(map.entrySet());
		li.sort(Map.Entry.comparingByValue());

		li.forEach((str) -> System.out.println(str.getKey() + "=> " + str.getValue()));

	}

	public static void main(String[] args) {
		sortedValuesByMap();

	}

}
