package day7;

//User define class
class Student{
	String name;
	String qualification;
	int age;
	
	Student(){           //constructor
		System.out.println("Student Constructor.");
	}
	void study(){             //method - 1
		System.out.println("Student in studying.");
	}
	void run(){               //method - 2
		System.out.println("Student is running.");
	}
	void sleep() {
		System.out.println("Student is sleeping.");
	}
	
}

public class Constructor {
	public static void main(String[] args) {
		//new Student(); //explicitly while creation of object we call the object. 
		Student s1 = new Student();
		s1.study();
		s1.run();
		s1.sleep();

	}

}
