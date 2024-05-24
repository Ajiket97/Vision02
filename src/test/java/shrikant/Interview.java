package shrikant;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Interview {

	public static void iterationHashMap() {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Shrikant");
		map.put(2, "ABC");
		map.put(3, "XYZ");

		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		for (Map.Entry<Integer, String> e : entry) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		iterationHashMap();
	}

}
