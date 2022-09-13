package Fresh;

public class Operators {

	public static void main(String[] args) {
		
		int a =10;
		int b = 15;
		
		//Arithemtic operators
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	
		// Relational Operators (Values will be given in Boolean /True-- False)
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);

		
		// Logical Operators
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y); // False
		System.out.println(x || y);  // True
		System.out.println(!x);  // false
		System.out.println(!y); // True 
		
		// Assignmenet operators
		
		int c ;
		c=a;
		System.out.println(c);
		
		// Increment/Decrement Operators
		
		int d ;
		d=100;
		d--;
		
		System.out.println(d);
	}

}
