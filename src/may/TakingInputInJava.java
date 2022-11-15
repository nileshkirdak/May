package may;

import java.util.Scanner;

public class TakingInputInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int n=s.nextInt();
		
		for (int i=1; i<=10; i++)
		{
			System.out.println(n*i);
		}
		
	
		System.out.print("Enter String : ");
		
		String str=s.next();
		 System.out.println(str);
		
		 System.out.print("Enter float : ");
		
		 float m= s.nextFloat();
		System.out.println(m);	
		
		
		System.out.println("Enetr 5 Values into Array");
		
		int d[] = new int[3];
		
		
		for (int i=0;i<d.length;i++)
				{
		    d[i]= s.nextInt();
		    
		}
		
		
	}

}
