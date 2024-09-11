package day6;

public class Exp_String_Method2 {

	public static void main(String[] args) {
		String str1 = "anuj@123";
		
		//To check whether a string has a sequence of character. if have return true, else false => contains()
		System.out.println(str1.contains("anuj")); //return true    
		System.out.println(str1.contains("anj@123")); //return false

	}

}
