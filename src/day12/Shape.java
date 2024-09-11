package day12;

public abstract class Shape {
	float area;
	abstract void collectinput();
	abstract void calculatearea();
	void display() {
		System.out.println("The area is"+ " " +area);
	}

}
