package day12;

import java.util.Scanner;

public class Square extends Shape {
	float length;
	
	@Override
	void collectinput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length");
		length = scan.nextFloat();
	}
	@Override
	void calculatearea() {
		area = length*length;
	}
	
}
