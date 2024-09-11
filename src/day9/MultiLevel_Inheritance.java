package day9;

class X{
	int a;
	void display() {
		System.out.println(a);
	}
}
class Y extends X{
	int b;
	void show() {
		System.out.println(b);
	}
}
class E extends Y{
	int c;
	void print() {
		System.out.println(c);
	}
}


public class MultiLevel_Inheritance {
	public static void main(String[] args) {
	E obj = new E();
	obj.a = 100;
	obj.b = 200;
	obj.c = 300;
	obj.display();
	obj.show();
	obj.display();

	}

}
