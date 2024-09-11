package day12;

public class Demo1 implements Compute {
	@Override
	public void add() {
		int num1, num2, res;
		num1 = 10;
		num2 = 30;
		res = num1 + num2;
		System.out.println("The result is"+" "+ res);
	}
	@Override
	public void sub() {
		int num1, num2, res;
		num1 = 30;
		num2 = 10;
		res = num1 + num2;
		System.out.println("The result is"+" "+ res);
	}

}
