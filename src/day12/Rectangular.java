package day12;

import java.util.Scanner;

public class Rectangular extends Shape{
	
	double length;
	double width;
	@Override
	void collectinput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Length");
		length = scan.nextFloat();
		System.out.println("Enter the Width");
		width = scan.nextDouble();
	}
	@Override
	void calculatearea() {
		area = (float) (length * width);
		}
	
}
