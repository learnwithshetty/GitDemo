package Fresh;

public class Programs {

	public static void main(String[] args) {   
		
         /*for(int i =3 ; i<=30;i++)
         {
        	 if(i%3==0)                 //a program to print all the nos divisible by 3 b/w 3-30
        	 {
        		 System.out.println(i);
        	 }
         }*/
		
		/*for(int i =2;i<=30;i=i+2)
		{
			System.out.println(i);    //a program to print odd & even numbers 
		}*/
		
		
		for(int i =5;i>=1;i--)  // outer foorloop
		{ 
			for(int j = 1;j<=i;j++)   // inner foorloop
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
