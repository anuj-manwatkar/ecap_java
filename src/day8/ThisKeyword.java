package day8;

public class ThisKeyword {
	//This Keyword  => used to differentiate the [instance & local variable]
	/*
	 1. instance variable / class
	 2. local variable / main 
	*/
	
	int x, y;    //class variables / instance variables
	
	ThisKeyword(int x, int y){    //constructor with parameter
		this.x = x;   //this keyword => gives reference to the current object
		this.y = y;
	}
	
	void display() {   //method
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword(100,200);
		th.display();
	}

}
