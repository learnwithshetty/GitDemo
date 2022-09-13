package Fresh;

public class ExceptionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =50;
		try
		{
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enetred catch block in line 15");
		}
		
		finally
		{
			System.out.println("Enetred Final block");
		}
	}

}
