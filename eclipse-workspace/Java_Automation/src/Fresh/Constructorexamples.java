package Fresh;

public class Constructorexamples {
	
	int x;
	int y;
	
	Constructorexamples(int a , int b)
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
	
		Constructorexamples CE = new Constructorexamples(100,200);
		CE.display();

	}

}
