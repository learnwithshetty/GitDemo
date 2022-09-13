package Fresh;

public class ThisKeyword {
	
	int a , b;         //class variables
	
	void getvalues(int a , int b)       // method variables
	{
		this.a=a;
		this.b=b;
	}
	
	void printvalues()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// If we need to use same method variables & class variables then we need to use this keyword 
		
		ThisKeyword th = new ThisKeyword();
		th.getvalues(10, 20);
		th.printvalues();

	}

}
