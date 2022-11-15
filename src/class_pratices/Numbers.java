package class_pratices;

public class Numbers {

	
	static int a=14;
	
	static int b=14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String x = Integer.toBinaryString(a); 
		  System.out.println(x);
		a>>=2;
		
		  String y = Integer.toBinaryString(a); 
		  System.out.println(y);
		  
		System.out.println("Result:"+a);
		
		
	}

}
