package pp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class pp{
	public static void main(String[] args) {
		Set set = new HashSet<>();
		
		do {
			int rand = (int) (Math.random() * 49);
			set.add(rand);
		}while(set.size() != 6);
		
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}