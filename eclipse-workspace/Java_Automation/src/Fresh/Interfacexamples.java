package Fresh;


interface Testint
{
	int a =10;
	void m1();   // abstract method by default will be in public
}

interface Testnew
{
	int b=100;
	void m2();
}

public class Interfacexamples implements Testint , Testnew

{
	
	public void m1()
	{
		System.out.println(a);
	}
	
	public void m2()
	{
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interfacexamples IE = new Interfacexamples();
		IE.m1();
	    IE.m2();

	}

}
