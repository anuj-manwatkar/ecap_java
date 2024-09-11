package day12;

public class ApplicationShape {

	public static void main(String[] args) {
		//1. Area of Circle
		System.out.println("Calculating area of circle");
		Circle cl = new Circle();
		cl.collectinput();
		cl.calculatearea();
		cl.display();
		
		//2. Area of Square
		System.out.println("Calculating area of square");
		Square sq = new Square();
		sq.collectinput();
		sq.calculatearea();
		sq.display();
		
		//3. Area of Rectangular
		System.out.println("Calculating area of rectangle");
		Rectangular rl = new Rectangular();
		rl.collectinput();
		rl.calculatearea();
		rl.display();
	}

}


//o/p
/*
Calculating area of circle
Enter radius
23.3
The area is 1704.6746

Calculating area of square
Enter length
12
The area is 144.0
*/
