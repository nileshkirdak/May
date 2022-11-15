package may;

public class Relationaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=36, y=36;

		boolean z;
		
		z=x<=y;
		System.out.println("value of z:"+z);
		
		x=47;
		y=29;
		z=x>y;
		System.out.println("value of z:"+z);
		
		z=x<y;
		System.out.println("value of z:"+z);
		x=49;
		y=49;
		
		z=x==y;
		System.out.println("value of z:"+z);
		
		x=47;
		y=35;

		z=x!=y;
		System.out.println("value of z:"+z);
		
		int a=-4;
		 x=~a;
		 System.out.println("value of x:"+x);
		 
		//not operator 
		 boolean q=false; 
		  z=!q;
		  System.out.println("value of z :"+z);
		//postfix 
		  int m=18, n;
		  n=m++;
		  System.out.println("value of n :"+n);
		  System.out.println("value of m:"+m);
	
		   //prefix 
		  m=20;
		 n=--m;
		 System.out.println("value of n :"+n);
		  System.out.println("value of m:"+m);
		 
	}

}
	