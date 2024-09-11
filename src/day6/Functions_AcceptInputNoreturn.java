package day6;

class Calculator1{ //User define class
	
	//add(int num1, int num2) => accept the input
	//void => not return any value compulsory
	void add(int num1, int num2) { //add method = accept input
		int sum;
		sum = num1+num2;
		System.out.println("The sum is:"+" "+sum);
	}
}
	
public class Functions_AcceptInputNoreturn {
	
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1(); //create an object
		c1.add(10, 40); //50 //calling method
	}

}