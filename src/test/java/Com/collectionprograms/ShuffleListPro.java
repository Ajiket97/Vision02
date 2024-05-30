package Com.collectionprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleListPro {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("code");
		li.add("with");
		li.add("Testing");
		li.add("Shastra");
		
		Collections.shuffle(li);
		System.out.println(li);
		

	}

}
