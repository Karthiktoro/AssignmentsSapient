package assigmentday7;

import java.util.HashMap;
import java.util.Map;

public class CustomerDetails {
	static Map<Integer, MyBank> m ;
	static {
		m= new HashMap<Integer, MyBank>();
		
		m.put(101, new MyBank(101, "karthik", "HAssaN", 600));
		m.put(102, new MyBank(102, "madhan", "HAssaN", 300));
		m.put(103, new MyBank(103, "suku", "HAssaN", 500));
		m.put(104, new MyBank(104, "modi", "HAssaN", 600));
		m.put(105, new MyBank(105, "gowdru", "HAssaN", 700));
		
	}
}
