package Fresh;

public class Methodexamples {

	
	
		int id ;
		char name ;
		
		void getValues(int i , char a )
		{
			id =i;
			name = a;
		}
		void display()
		{
			System.out.println(id+"" + name);
		}
	

public static void main(String[] args) {
	
	Methodexamples ME =x new Methodexamples();
	ME.getValues(10, 'a');
	ME.display();
}

}
// TODO Auto-generated method stub
// Constructor is also special type of method 
//It is used only for initilizing the class variables
// Constructor name should be same as class name
// No need to call constructor explicility
// No return type