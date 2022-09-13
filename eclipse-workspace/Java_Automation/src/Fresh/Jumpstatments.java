package Fresh;

public class Jumpstatments {

	public static void main(String[] args) {
		 // Break :- will immeditaley exit from the loop
		  // Continue :- it will check the condition & skip the level 
		
		
		/*for(int i = 1;i<=10;i++)
		{
			if(i==7)
			{
				break;
			}
			System.out.println(i);
		}*/

		for(int i = 1;i<=10;i++)
		{
			if(i==3||i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		
		
		
	}

}
