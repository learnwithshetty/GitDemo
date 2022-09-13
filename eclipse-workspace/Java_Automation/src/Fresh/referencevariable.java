package Fresh;

public class referencevariable {

	
		// TODO Auto-generated method stub
		
		// Class is a collection of variables & Methods 
		//Method :- a block of code which contains a logic 
		// Object :- object is an instance of class 
		
		//Main()c:- this a method where actual execution starts 
		// void = return type
		
		int eid;    // class variables 
		String name;
		int deptno;
		
		void display()
		{
			System.out.println(eid);  //class method
			System.out.println(name);
			System.out.println(deptno);
		}

		
		public static void main(String[] args) {
			
			referencevariable rv = new referencevariable();
			rv.deptno=101;
			rv.name="Rohith";
			rv.deptno=1;
			rv.display();
			
			
	}
}


