package assigmentday7;

import java.util.*;

public class SortedSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedSet s = new TreeSet<String>();
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
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String item : s) {
			System.out.println(item);
		}
	}

}
