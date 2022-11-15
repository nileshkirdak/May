package collection;

import java.util.LinkedHashSet;

public class HashSetLink1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Object> h1=new LinkedHashSet<Object>(); 
		
		// Wrapper class
		Integer a=new Integer(90);
				System.out.println(a);	
		// LinkedHashset have not index access
		h1.add(null);
		h1.add(87);
		h1.add(87);
		h1.add("Nilesh");
		h1.add(26);
	
		h1.add("hii");
	
		
		System.out.println(h1);
		
		h1.remove(26);
		System.out.println(h1);
		
	}

}
