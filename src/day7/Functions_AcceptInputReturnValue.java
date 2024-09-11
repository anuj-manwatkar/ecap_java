package day7;

//User define class
class Value{
	//Methods
	//4. Functions accept inputs and return a value
	int add(int num1, int num2) {
	int sum;
	sum = num1 + num2;
	return sum;
	}
}

public class Functions_AcceptInputReturnValue {
	public static void main(String[] args) {
	Value v1 = new Value();
	int res = v1.add(10, 40);
	System.out.println("The sum is "+res);

	}

}
