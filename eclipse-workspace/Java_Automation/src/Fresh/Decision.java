package Fresh;

public class Decision {

	public static void main(String[] args) {
		
		
		int a =30;
		int b =30;
		
		if(a>b)
		{
			System.out.println("B is Greater number");// Only if the condition is satisfied the output can be expected
		}
		else if(a<b)
		{
			System.out.println("A is Smaller  number"); // if the condition is not satisfied also we can expect the output
		}
		else if(a==b)
		{
			System.out.println("A & B is equal"); // Will check mutiple of conditions
		}
		else
		{
			System.out.println("Noting is valid");
		}
	}

}
