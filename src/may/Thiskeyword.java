package may;

public class Thiskeyword {

	 int n=87;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thiskeyword a= new Thiskeyword();
		
		
		//Thiskeyword b= new Thiskeyword(39);
		
		
	}
	public static void get ()
	{

		
		System.out.println("inside get:");
	}
	
	public Thiskeyword()
	{
		//this(39);
		this.show();
		//this(39);
		
		System.out.println("inside default constractor:");
	}
	
	
	public Thiskeyword(int q)
	{
		
		
		System.out.println("inside paramerised constrctor:"+ n);
	}
	
	public void show()
	{

		System.out.println("inside show methodes");
		System.out.println("value of n:"+ n);
	}
	
}
