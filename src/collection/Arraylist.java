package collection;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int b =57;
		Integer a = new Integer (90);
		
		ArrayList <Integer> a1=new ArrayList<Integer>();
		
		Integer d =new Integer (78);
		
		a1.add(a);
		a1.add(b);
		a1.add(d);
		
		a1.add(3, 75);
		a1.add(3, 63);
		a1.add(3, 14);
		
		
		
		System.out.println(a1);
		a1.remove(3);
		
		System.out.println(a1);
	}

}
