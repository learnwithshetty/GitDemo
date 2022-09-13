package Fresh;

public class TwoDimensional {

	public static void main(String[] args) {
		
      // int a [][]=new int[5][5];// when we are aware of limit
		
		int a [][]= {{100,200},{200,300},{300,400}};
		
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a[i].length;j++)
				
			{
				System.out.println(a[i][j]);
			}
		}
	}

}
