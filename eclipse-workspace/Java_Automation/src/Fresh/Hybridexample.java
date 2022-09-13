package Fresh;

class A10
{
	void n1()
	{
		System.out.println("This is the method from A10 class");
	}
}

interface A7
{
	void n2();
}

interface A6
{
	void n3();
}
public class Hybridexample extends A10 implements A7,A6 {
	
	public void n2()
	{
		System.out.println("This is the method from A7 interface");
	}
	
	public void n3()
	{
		System.out.println("This is the method from A6 interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hybridexample HE = new Hybridexample();
		HE.n1();
		HE.n2();
HE.n3();

	}

}
