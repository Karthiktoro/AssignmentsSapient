package collections;

import java.util.*;

public class MyList {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();

		names.add("John");
		names.add("Peter");
		names.add("Rahul");
		names.add("Chetan");
		names.add("Kirti");
		names.add("Srinivas");
		System.out.println(names);

		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			if (names.contains("Peter")) {
				System.out.println("peter");
			}

		}

		for (String name : names) {
			if (names.contains("Peter")) {
				System.out.println("Peter");
			}
		}

	}

}
