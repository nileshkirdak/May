package collection;

import java.util.HashMap;

public class HashMapInJava {

	static int a=87;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		HashMap<Integer, Character> hm=new HashMap();
		
		hm.put(85, 'W');
		hm.put(78, 'v');
		hm.put(12, 'a');
		hm.put(null, 'C');
		hm.put(2, 'C');
		hm.put(85, 'D');
		System.out.println(hm);
		
		hm.remove(12);
		System.out.println(hm);
			
		HashMapInJava a1=new HashMapInJava();
		a1.show();
	}

	public static void get()
	{
		System.out.println("in side get method");
		
	}
	public void show()
	{
		int a=56;
		
		
		System.out.println(a);
		System.out.println(this.a);
		
		HashMapInJava.get();
		

	
	}
	
}
