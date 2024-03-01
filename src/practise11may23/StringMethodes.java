package practise11may23;

public class StringMethodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="I am Nilesh";
		String strg = " I am senior software test engineer";

		

		//String str1 = new String();

		String str1 = str.toUpperCase();

		System.out.println(str1);
		
		String str2 = new String();

		str2= str.toLowerCase();

		System.out.println(str2);
		


		String str3 = new String ();


		str3 = str + strg ;


		System.out.println(str3);
		

 
		String str4 = new String ();

  
		str4 = str.concat(strg);
 
		System.out.println(str4);
		
		System.out.println(str.charAt(0));
		
		char a = str.charAt(3);
		System.out.println(a);
		
		char b[]= str.toCharArray();
		
		for (int i=0; i<b.length; i++)

		{
		   System.out.println(b[i]);
		  }
		
		String str5= new String("I am senior test engineer");
		
		System.out.println(str5);
		
		System.out.println(str5.indexOf('m'));
		
		System.out.println(str5.contains("senior"));
		
		System.out.println(str5.startsWith("g"));
		
		System.out.println(str5.endsWith("engineer"));
		
		String str6 =new String("    Hello Nilesh    ");
		
		
		System.out.println(str6.trim());
		System.out.println(str6);
		
		
	}

}
