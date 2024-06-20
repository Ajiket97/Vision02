package shrikant;

import java.util.Set;
import java.util.TreeSet;

public class SecondMax {

	public static void main(String[] args) {
	        int[] x={2,4,10,3,100,70,5};
	        TreeSet<Integer> ts=new TreeSet<Integer>();
	        for(int i:x){
	            ts.add(i);
	        }
	       System.out.println(ts.headSet(ts.last()).last());

	}

}
