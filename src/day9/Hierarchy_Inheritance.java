package day9;

class Parent{
	void display(int a) {
		System.out.println(a);
	}
}
class Child1 extends Parent{
	void show(int b) {
		System.out.println(b);
	}
}
class Child2 extends Parent{
	void print(int c) {
		System.out.println(c);
	}
}
class Child3 extends Parent{
	void prints(int d) {
		System.out.println(d);
	}
}


public class Hierarchy_Inheritance {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.display(10);
		c1.show(20);
		
		Child2 c2 = new Child2();
		c2.print(30);
		c2.display(40);
		
		Child3 c3 = new Child3();
		c3.prints(50);
		c3.display(60);

	}

}
