package day6;

class Calculator{ //User define class
	
	//add() =>  not accept input 
	//void => not return any value compulsory
	void add() {   //add method   
		int num1, num2, sum;
		num1 = 20;
		num2 = 30;
		sum = num1+num2;
		System.out.println("The Sum is : "+sum);
		System.out.println("The Sum is"+" "+sum);
	}
}

public class Functions_NoInputNoreturn {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator(); //create an object
		c1.add();  //calling method
	}
}
