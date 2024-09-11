package day7;

//User define class
class Return{
	//Method
	//3. Functions doesn't accept any inputs but returns value
	int add() { //returns value- i.e. int
		int num1, num2, sum;
		num1 = 10;
		num2 = 20;
		sum = num1 + num2;
		return sum;
	}
}


public class Functions_NoInputsReturnsValue {
	public static void main(String[] args) {
		Return r1 = new Return();
		int res = r1.add();
		System.out.println("The sum is"+" "+res);
		

	}

}
