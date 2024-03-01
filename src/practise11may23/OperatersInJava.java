package practise11may23;

public class OperatersInJava {

	 int a = 24;
	 int b=78;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperatersInJava o = new OperatersInJava() ;
		 
		o.assignmentOperaters();
		
	}
	
	public void assignmentOperaters() 
	{
		a+=b; //i.e a=24+78=102
		System.out.println("value of a : "+ a);
		
		
		a-=b; // i.e a=102-78=24
		System.out.println("value of a:" + a);
		
		a*=2; // i.e a=24*2=48
		System.out.println("value of a:" + a);
		
		a/=12; // a=48/12=4
		System.out.println("value of a:" + a);
	}
}
