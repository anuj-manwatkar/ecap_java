package day4;

public class OOPS_Employee_Class {
	
	//Variables    - attributes => 4
	int eid;
	String ename;
	String ejob;
	int esal;
	
	//Methods      - behavior => 1
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(ejob);
		System.out.println(esal);
	}

	public static void main(String[] args) {
		//Object - can create multiple objects having class attribute & behavior, but data should unique 
		OOPS_Employee_Class emp1 = new OOPS_Employee_Class(); //Created object here 'new' is => object 
		emp1.eid = 101;          //Calling Variables and Assigning Value to it
		emp1.ename = "Anuj";
		emp1.ejob = "Developer";
		emp1.esal = 2000000;
		emp1.display();        //Calling Display methods here
		System.out.println();
		
		OOPS_Employee_Class emp2 = new OOPS_Employee_Class();
		emp2.eid = 102;
		emp2.ename = "Harsh";
		emp2.ejob = "Developer";
		emp2.esal = 300000;
		emp2.display();

	}

}
