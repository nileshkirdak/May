package may;

public class MethodWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodWithParameter s=new MethodWithParameter(58,47);
		
		s.add(25, 5);
	}
	
	public MethodWithParameter (int a,int b)
	{
		System.out.println("value of a: "+ a);
	}
	
	
	
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("value of c: "+ c);
	}
	
}
