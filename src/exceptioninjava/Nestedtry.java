package exceptioninjava;

public class Nestedtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x= 0;
		int a=0, b=25, c=56;
		
		try
		{
			x= b/a;
			//	x=a+b;
			try 
			{
				x= c/a;
			}
			catch (ArithmeticException e)
			{  
				 e.printStackTrace();
			}
		}
		
		catch (ArithmeticException e)
	
		{
			e.printStackTrace();
		}
		
		
	}

}
