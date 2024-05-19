package shrikant;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateHashMap {

	public static void main(String[] args) {
		Map<String,Integer> rollMap=new HashMap<String,Integer>();
		rollMap.put("Shrikant", 1);
		rollMap.put("Jyoti", 2);
		rollMap.put("Sanavi", 3);
		
		System.out.println(rollMap);
		//How to iterate Hashmap 1. using iterator
		Iterator<String> itr=rollMap.keySet().iterator();//dont apply iterator directly on map,first on keyset,then apply iterator
		while(itr.hasNext()) {
			String key=itr.next();
			Integer value=rollMap.get(key);
			System.out.println("Value: "+value+"Key: "+key);
		}
		System.out.println("-----");
		//How to iterate Hashmap 2. using entryset
		Set<Entry<String, Integer>> entry=rollMap.entrySet();
		for (Entry<String, Integer> e : entry) {//use foreach loop 
			System.out.print(e+",");
		}
		System.out.println("-----");
		//How to iterate Hashmap 3. using entryset second method
				Iterator<Entry<String, Integer>> itr2=rollMap.entrySet().iterator();
						while (itr.hasNext()) {
							Entry<String, Integer>  entry1=itr2.next();
							System.out.println("Key: "+entry1.getKey()+"Value"+entry1.getValue());
							
						}	
		//How to iterate Hashmap 4. using foreach and lamda->	very famous
						System.out.println("-----");
				 rollMap.forEach((k,v) ->System.out.print("Key:"+k+"," +"Value:"+v));
				}
	
	}



