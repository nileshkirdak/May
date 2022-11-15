package class_pratices;

public class B extends A {

	int w;
	int s;
	public B ()
	{
	
		 w=36;
		 System.out.println("inside default constructor value of w:"+ w); 
	}
	
	public B(int s)
	{
		
		//super (37);
	
		 s=97;
		 
	}
	
	public void show()
	{
		System.out.println("inside child class method"); 	
		r=369;
		// super.show();
	}
	public static void main (String[] args) {
		
		A a1=new A();
		a1.r=369;
		System.out.println("value of r"); 
		B b1= new B();
		
		b1.show();
	   B b2= new B(84);
	   
	   A b3 = new B();
	   b3.show();
		
	}
}
