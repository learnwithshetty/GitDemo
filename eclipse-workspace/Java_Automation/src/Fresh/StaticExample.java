package Fresh;

public class StaticExample {

	int a ; // non static 
	static int b; // static 
	
	static void m1()
	{
		System.out.println("this is static method");
	}
	
	void m2()
	{
		System.out.println("this is non static method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		b=150;
		System.out.println(b);
		m1();
		
		StaticExample SE = new StaticExample();
		SE.a=100;
		System.out.println(SE.a);
		SE.m2();
		
		
	}

}
