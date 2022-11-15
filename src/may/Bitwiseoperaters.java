package may;

public class Bitwiseoperaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a=19, b=14;
	
	// & operater //if both inputs are 1 output is 1 otherwise 0

	int	c=a&b;
	
		  String x = Integer.toBinaryString(a); 
		  System.out.println(x);  
		  String y = Integer.toBinaryString(b);
		  System.out.println(y);
		  
		  String z = Integer.toBinaryString(c);
		  System.out.println(z);
		  System.out.println(c);

		 // | (or) operater //if both inputs are 0 output is 0 otherwise 1
		  c=a | b;
		  String q = Integer.toBinaryString(c); 
		  System.out.println(q);
		  System.out.println(c);

	      // ^ (XOR) //if inputs are different output is 1 otherwise 0
		  c=a ^ b;
		  String w = Integer.toBinaryString(c); 
		  System.out.println(w);
		  System.out.println(c);
		  
	}

}
