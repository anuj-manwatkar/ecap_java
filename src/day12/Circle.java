package day12;

import java.util.Scanner;

public class Circle extends Shape {
	float radius;
	
	@Override
	void collectinput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius");
		radius = scan.nextFloat();	
	}
	@Override
	void calculatearea() {
		area = 3.14f*radius*radius;
	}
}
