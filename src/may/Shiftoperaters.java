package may;

public class Shiftoperaters {
	public static void main (String[]args) {
	int	a=70, b=9;
   // Right shift 
	int c = a>>3;
	String x = Integer.toBinaryString(a); 
	 System.out.println(x);  
	 String q = Integer.toBinaryString(c);
	 System.out.println(q);  
	System.out.println(c);
	
	
	// left shift 
	
	c=b<<2;
	String y = Integer.toBinaryString(b); 
	  System.out.println(y); 
	  
	  String z = Integer.toBinaryString(c);
	  System.out.println(z);
	System.out.println(c);
		
	}

}
