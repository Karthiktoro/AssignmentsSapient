package com.exceptions;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		try {
			String[] names = new String[5];
			//System.out.println(names[0].equals(0));
			names[6] = "John";
		}
		catch(NullPointerException|ArrayIndexOutOfBoundsException e){
			//System.out.println(e);
			e.printStackTrace();
		}
		/*finally {
			System.out.println("done");
		}*/
		
		

	}

}
