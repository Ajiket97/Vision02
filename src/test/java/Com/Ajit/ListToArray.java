package Com.Ajit;

import java.util.ArrayList;
import java.util.Collections;

public class ListToArray {
	public static void main(String[] args) {
		System.out.println("**********Before SHUFFEL***********");

		ArrayList al = new ArrayList();
		al.add("virat");
		al.add("fab");
		al.add("maxxi");
		al.add("dk");
		System.out.println(al);
		System.out.println("**********AFTER SHUFFEL***********");
		Collections.shuffle(al);
		System.out.println(al);
	}
}
