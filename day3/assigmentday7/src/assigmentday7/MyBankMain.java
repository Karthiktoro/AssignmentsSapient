package assigmentday7;

import java.util.*;
import static assigmentday7.CustomerDetails.m;

public class MyBankMain {
	 

	public String getInfo(Integer customerId) {
		if( m.containsKey(customerId)) {
			return m.get(customerId).getDetails();
		}else {
			return "nothing";
		}}
		
		//String setInfo(int customerId1) {
			//if(m.containsKey(customerId1)) {
				//return "present";
			//}else {
				//m.put(customerId1 , new MyBank(customerId1,name , address, accountBalance));
			//}
		//}
		
	public List<String> getDe(int amount){
		List<String> l = new ArrayList<String>();
		Set<Integer> s = new HashSet<>();
		
		for(Integer item : s) {
			MyBank k = m.get(item);
			if(amount>=500) {
				l.add(k.getDetails());
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		
		MyBankMain b = new MyBankMain();
		System.out.println(b.getInfo(101));
		System.out.println(b.getDe(500));
		
	}
}
