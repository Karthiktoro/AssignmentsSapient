package collections.app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	Map<Integer ,Person > personDb;
	public Main() {
		
	
		 personDb = new HashMap<Integer , Person>();
		personDb.put(100,new Person(100,"Karthik" , "bangalore"));
		personDb.put(101, new Person(101, "Rohit", "mangalore"));
		personDb.put(102, new Person(102, "Virat", "delhi"));
		personDb.put(103, new Person(103, "Ravindra", "noida"));
		personDb.put(104, new Person(102, "sachin", "chochin"));
		personDb.put(105, new Person(102, "narendra", "gao"));
		personDb.put(106, new Person(102, "vijay", "jammu"));
		personDb.put(107, new Person(102, "v", "goa"));
		personDb.put(108, new Person(102, "bill", "bangalore"));
		personDb.put(109, new Person(102, "mark", "delhi"));
	}
		public String findPerson(int personId) {
			if(personDb.containsKey(personId)) {
				return personDb.get(personId).getDetails();
			}else {
				return "nothing";
			}
		}
		
		
		public static List<String> listPersonByCity(String cityName){
			
			
			
			return null;
			
			
		}
		
		public static void main(String[] args) {	

			String city = "Hyderabad";
			Main p = new Main();
			System.out.println(p.findPerson(101));
			System.out.println(p.listPersonByCity("bangalore"));
			
	}

}
