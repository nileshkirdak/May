package may;
public class Practice {
	boolean x = false;
	static boolean b=true;
	
	float g=20.003f;
	
	char p='N';
	
	
	
	public static void main(String[]args) {
		Practice s=new Practice();
		
		s.x = true;
		//System.out.println(s.x);
		b=true;
		
		int q = 24 ;
		int w=25;
		boolean e= q!=w;
		
		System.out.println(e);
		s.get();		
	}
	public void get() {
		int a=18;
		a++;
		
		System.out.println(a);
		
			int	r= --a;
			
			System.out.println(r);
		x= true;
		//System.out.println(x);	
		b= false;
		
		Nilesh y=new Nilesh();
		
		y.p= 25;
		
	}
	class Nilesh{
		int p=17;
		
	}
	
	public void put() {
		p= 25;
		
	}
}