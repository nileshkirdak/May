package practice_feb24;

public class Operaters {
	
	int a= 28;
	int b = 104;
	
	public static void main (String [] args) {
		
		Operaters p = new Operaters();
		p.arithmetical_operater();
		p.logicalOperaters();
		p.assignmentOperaters();
		p.relationalOperaters();
	}

	public void arithmetical_operater ()
	{
		
		int c = a+b; float d= b/a;
		System.out.println("value of c:" + c  );
		System.out.println("value of d :" + d);
		
	}
	
	public void logicalOperaters()
	{
		boolean e = (a<b) && (b>a);
		
		System.out.println("value of e:" + e);
		
		boolean f = (a<=b) || (a<b);
		
		System.out.println("value of f:" + f);
		
	}
	
	public void assignmentOperaters()
	{
		a+=b;
		System.out.println("value of a:" + a);
		
		b-=a;
		System.out.println("value of b:" + b);
		
	}
	
	public void relationalOperaters ()
	{
		
		 boolean g = a < b ;
		 System.out.println("Value of g :" + g);
	}
	
}
