package may;

public class ForEachLoop {

int i= 25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 
			
		 
		char a[]= {'a','j','y'};
	// first method to display array on console
		nilesh:for (int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
		// Second method to display array on console
		// For Each Loop
		for (char b: a)
		{
			System.out.println(b);
		}
		
		String str[]= {"hii","nilesh"};
		for (String c : str)
			
		{
			System.out.println(c);
			
		}
			//enum
			
			enum w {jan,feb,mar};
			
			w a1[]=w.values();
			
			for (w a2: a1)
			{
				System.out.println(a2);
				
			}
			
			
			
			
			
			enum month {January, February, March, April, May, June, July}; 
			
			month m[]=month.values();
			
			for (month x: m)
			{
				System.out.println(x);
				
			}
			
			 int s[][]= { {2,3,4},{4,5,6},{7,8,9} }; 
			 
			
			 
			 for(int i=0;i<s.length;i++)
				 { 
				 for(int j=0;j<s.length;j++ ) 
				 
				 { 
				 System.out.println(s[i][j]); 
				 } 
				 }
			 System.out.println(s[0] [0]);
			 
		}
		
	}


