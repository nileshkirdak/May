package may;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         double w = 63.24;
         char q ='a';
         
         String str= "i am nilesh";
		 int a=5;
		 float b=65f;
		  a+=b; //a=a+b
		  System.out.println("value of a :"+a);
		  System.out.println("value of b :"+b);
		  
		  a-=50;
		  System.out.println("value of a :"+a); 
		  
		  a*=20;
		  
		  System.out.println("value of a :"+a);
		  
          a/=10;
		  
		  System.out.println("value of a :"+a);
		  
		  b%=2;
		  System.out.println("value of b :"+b);
		  
		  float q1=65f; // q= q%3
		  q1%=3;
		  System.out.println("value of q :"+q1);
		  
		   int h=12; 
		   String f = Integer.toBinaryString(h);
		   System.out.println("value of f :"+f);
		   h>>=2;     // h= h>>2  // 1*2^0 + 1*2^1 =1+2 =3 
		   System.out.println("value of h :"+h);
		   
		   int u=8; 
		   String g = Integer.toBinaryString(u);
		   System.out.println("value of g :"+g);
		   u<<=2; 
		   System.out.println("value of u :"+u);
		  
		  
		  
	}


}
