package day5;

public class String_Methods {

	public static void main(String[] args) {
		//To calculate lenth of string
		String name = "Anuj";
		String name2 = "Manwatkar";
		System.out.println(name.length());
		
		//To Convert into upper-Case
		System.out.println(name.toUpperCase());
		
		//To Convert into lower-Case
		System.out.println(name.toLowerCase());
		
		//To Concatination two string => + operator
		System.out.println(name+" "+name2);
		
		//To Concatinate two String using => .concat() method
		System.out.println(name.concat(" ").concat(name2));
		

	}

}
