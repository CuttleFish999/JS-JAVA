package hw01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hw02 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5, 6, 6 };
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			set.add(arr[i]);
		}
		
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
