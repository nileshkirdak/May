package abtraction;

public abstract class A {
	
	static int n=25;
	
	int m=36;
	public abstract void show();

	public abstract void get();
	
	public void get_in ()
	{
		System.out.println("inside parent class");
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("value of n: " + n);
		
	}
	
	
}
