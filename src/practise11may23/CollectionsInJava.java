package practise11may23;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(10);
		a1.add(25);
		a1.add(34);
		a1.add(36);
		
		System.out.println(a1);
		
		for(int c : a1)
		{
			
			System.out.println(c);
		}
		
		ArrayList<Object> a2 = new ArrayList<Object>();
		
		
		a2.add("Nilesh");
		a2.add("Kirdak");		
		a2.add(10.36);		
		a2.add(58);
		
		System.out.println(a2);
		

		TreeSet<Object> a3 = new TreeSet<Object>();
		
		
		a3.add(39);
		a3.add(47);		
		a3.add(10);		
		a3.add(58);
		
		System.out.println(a3);
		
		ArrayList<Integer> a4 = new ArrayList<Integer>();
	
		LinkedList <Object> a5 = new LinkedList<Object>();
		
		HashSet <Object> a6 = new HashSet<Object>();
		
		LinkedHashSet <Object> a7= new LinkedHashSet<Object>();
		
		
		
		
		
	}

}
