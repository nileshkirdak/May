package class_pratices;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 //compile time polymorphism -- constructor overloading
		 //compile time polymorphism -- method overloading
		
		//how to call those methods 
		
		
		Polymorphism p=new Polymorphism();
		
		p.show(78);
		p.show();
 	}	
	
		public Polymorphism ()
		{
			int n=23;
		}
		
	public Polymorphism(int x)
	{
		int n=36;
		
	}

	
    public void show() {
    	
    }
	
	
    public void show(int y)
    {
    	System.out.println("value of y:" + y );
    }
	

}
