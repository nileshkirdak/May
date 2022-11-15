package may;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2,b=1;    //int char enum
		
		switch (a)
		{
		case 1:
			
			System.out.println("value in case 1 in a");
			break;
		case 2:
			System.out.println("value in case 2 in a");
			break;
		 default: 
			 System.out.println("No Cases Matched in a");
		}
		
		switch (b)
		{
		case 1:
			System.out.println("value in case 1 in b");
			break;
		case 2:
			System.out.println("value in case 2 in b");
			break;
		default:
			System.out.println("No Cases Matched in b");
		}
		
	}

}
