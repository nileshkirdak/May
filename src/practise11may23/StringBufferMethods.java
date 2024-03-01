package practise11may23;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("I am Nilesh");
		
		sb.append(" I am senior test engineer");
		
		System.out.println(sb);
		
		sb.insert(11, "-");
		
		System.out.println(sb);
		
		sb.reverse();

		System.out.println(sb);
	}
}
