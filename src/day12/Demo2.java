package day12;

public class Demo2 implements Compute {
	@Override
	public void add() {
		float num1, num2, res;
		num1 = 10.23f;
		num2 = 30.4f;
		res = num1 + num2;
		System.out.println("The result is"+" "+ res);
	}
	@Override
	public void sub() {
		float num1, num2, res;
		num1 = 30.5f;
		num2 = 10.32f;
		res = num1 + num2;
		System.out.println("The result is"+" "+ res);
	}
}
