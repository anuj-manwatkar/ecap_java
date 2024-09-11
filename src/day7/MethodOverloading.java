package day7;

//user define class
class Adder{
	//Methods
	void add() {                         //1
		int num1, num2, sum;
		num1 = 10;
		num2 = 30;
		sum = num1 + num2;
		System.out.println("The sum is "+sum);
	}
	void add(float a, float b) {         //2       //and again if have 2. (float a, int b); - then again don't give, change the order i.e. (int a, float b);
		float res;
		res = a + b;
		System.out.println("The sum is "+res);
	}
	void add(double a, double b) {        //3
		double res;
		res = a + b;
		System.out.println("The sum is "+res);
	}
	void add(int a, float b) {             //4
		float res;
		res = a + b;
		System.out.println("The sum is "+res);
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
	Adder adr = new Adder();
	adr.add();
	adr.add(42.55f, 12.66f);
	adr.add(5432.776, 7652.777);
	adr.add(23, 23.55f);
	}

}
