package may;

public class MethodWithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MethodWithReturnType a=new MethodWithReturnType ();		 
	     int x=a.show(25);  
	     System.out.println(x);
	
	     a.get();
	     a.show(49);
	}


	public int show (int n)
	{
		return n;
	}
	
	public void get()
	{
		 int q=show(28);
		 System.out.println(q); 
		  
	}
	
}
