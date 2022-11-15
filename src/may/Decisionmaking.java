package may;

public class Decisionmaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p=42, a=18;
		
		// If Statement
		if (p>a)
		{
			System.out.println("p is greater");
		}
	
		// If Else Statement
		
		if (a>p)
		{
			System.out.println("a is greater");
		}
		
		
		else
		{
			System.out.println("p is greater");
		}
		
	    // If Else Ladder Statement
		
		int b= 52, c=23 ;
		
		if(c>b)
		{
			System.out.println("c is greater");	
		}
		
		else if (b==20)
		{
			System.out.println("b is equal to 20");
		}
		
	    else if (b!=c)
		{
			System.out.println("b is not equal to c");
		}
		
	    else 
	    {
	    	System.out.println("all condition are fail");
	    }
		
		// Nested If 
		
		int w=25, q=36,r=58;
		
		if(w<q) 
		{
			if (q<w)
			{
				System.out.println("if under if");
			}
			
			else if(r==q) 
			{
				System.out.println("if under else if");
			}
			
			else if(q>r)
			{
				System.out.println("if under else if 2");
				
			}
			else
			{
				System.out.println("all condition are fail ");
			}
		}
			else 
			{
				System.out.println("all condition are fail 2 ");
			}
		}
		
			
	}

