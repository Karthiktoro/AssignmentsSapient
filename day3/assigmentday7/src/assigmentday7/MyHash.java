package assigmentday7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHash {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("karnataka");
		s.add("goa");
		s.add("kerala");
		s.add("MP");
		s.add("UP");
		s.add("andra");
		s.add("karnataka");
		s.add("andra");
		System.out.println(s);
		
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String item : s) {
			System.out.println(item);
		}
	}
	
	

}
