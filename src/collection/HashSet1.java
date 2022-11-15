package collection;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Object> h1=new HashSet<Object>(); 
		
	
		// Hashset have not index access
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
