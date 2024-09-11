package day13;

public class Wrapper_classes {

	public static void main(String[] args) {
		//Scenario 1
		//1. string ---> int
		
		//note: string does not belong to wrapper class, because we required to convert class
		/*String s = "welcome";  //cannot convert it into int
		
		String s1 = "10";
		String s2 = "20";
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); //method overloading
		*/
		
		//2. string --0> double
		/*
		String s1 = "10.56";
		String s2 = "20.34";
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		*/
		
		//3. string ---> boolean
		//note: other than true => return false
		String s = "true"; //other than true, if you pass any string; it will returns false
		System.out.println(Boolean.parseBoolean(s));
	}

}


//o/p
//1. string to int => 30
//2. string to double => 30.9
//3. string to boolean => true