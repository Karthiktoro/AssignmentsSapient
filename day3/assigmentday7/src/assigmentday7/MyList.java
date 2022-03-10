package assigmentday7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("suku");
		l.add("karthik");
		l.add("rahul");
		l.add("thash");
		l.add("gowda");
		l.add("mad");
		l.add("game");
		l.add("madhan");
		l.add("lekhan");
		l.add("modi");
		System.out.println(l);
		System.out.println(l.contains("rahul"));
		
		Iterator<String> itr= l.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println("heloo "+name);
		}
		
		for(String item: l) {
			System.out.println(item);
		}
		
		for(int i = 0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		ListIterator<String> listIterator = l.listIterator();  
		while(listIterator.hasNext())   
		{  
		//prints the elements of the List  
		System.out.println(listIterator.next());  
	}
}}
