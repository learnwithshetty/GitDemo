package Fresh;

interface one
{
	int x=100;
	void m10();
}

interface two 
{
	int d=200;
	void m20();
}

public class Newinterface implements one,two

{
	public void m10()
	{
		System.out.println(x);
	}
	
	public void m20()
	{
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Newinterface neee = new Newinterface();
		neee.m10();
neee.m20();
		
		
	}

}
