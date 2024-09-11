package day13;

public class Data_conv {

	public static void main(String[] args) {
		//Scenario 2
		//1. int, double, boolean, char ---> string
			int a = 10;
			double d = 10.5;
			char c = 'A';
			boolean booln = true;
			
			String s = String.valueOf(booln);
			System.out.println(s);
			
			s = String.valueOf(d);
			System.out.println(s);
			
			s = String.valueOf(c);
			System.out.println(s);

			s = String.valueOf(a);
			System.out.println(s);

	}

}

//o/p
/*
true
10.5
A
10
*/