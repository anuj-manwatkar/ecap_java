package day1;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int num1 = 30;  //initialization
		int num2 = 20;
		int sum;   ///declaration
		
		sum = num1 + num2;
		System.out.println("Addition is : "+sum);
		
		int difference;
		difference = num1 - num2;
		System.out.println("Difference is : "+difference);
		
		int product;
		product = num1 * num2;
		System.out.println("Product is : "+product);
		
		
		int division;
		division = num1 / num2;
		System.out.println("Division is : "+division);     //Quotient
		
		
		int modulus;
		modulus = num1 % num2;
		System.out.println("Modulus is : "+modulus);       //Remainder        
		
		
		num1++; //i.e.num1 = 30; 30++; 30+1 = 31       //num1 = num1 + 1; 
		System.out.println("Increment by 1 : "+num1);

		num1--; //i.e.num1 = 31; 31--; 31-1 = 30      //num1 = num1 - 1;   
		System.out.println("Decrement by 1 : "+num1);
		
		//num1 = 31 >> num1 - 1 >> num1--
	}

}
