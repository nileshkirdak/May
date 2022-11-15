package collection;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Integer> a1=new ArrayList<Integer>(); 
		
		a1.add(25);
		a1.add(0);
		a1.add(78);
		a1.add(78);
		a1.add(49);
		a1.add(2, null);
		//a1.add(78,69);
		System.out.println(a1);
		
		a1.remove(2);
		System.out.println(a1);
		
		Object x[] =a1.toArray();
		
		for(Object c:x)
		{
			System.out.println(c);
		}
			
		ArrayList<Object> a2= new ArrayList<Object>();
		
		a2.add("hii");

		a2.add("Nilesh");
		a2.add(null);
		a2.add(56);
		a2.add(56);
		a2.add(true);
		a2.add(25.36);
		
		System.out.println(a2);
		
	}

}
