package Fresh;

public class Overloading_Example {
	
	int a;
	int b;   
	
	void sum()
	{
		a=10;
		b=20;
		System.out.println(a+b);
	}
	
	void sum(int x, int y)
	{
		int a =x;
		int b=y;
		System.out.println(a+b);
	}
	void sum(int x,int y , float z)
	{
		System.out.println(x+y+z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Overloading methods /constrcutors with same name  but with different parameters
		Overloading_Example OE = new Overloading_Example();
		OE.sum();
		OE.sum(100,200);
		OE.sum(15,25,3.25f);
		
		
		
	
		
		

	}

}
