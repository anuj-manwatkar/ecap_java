package day6;

public class Exp_String_Method5 {

	public static void main(String[] args) {
		
		//It will extract sub string from main string => substring() 
		String str1 = "selenium";
		//s e l e n i u m 
		//0 1 2 3 4 5 6 7 - [SI]
		//1 2 3 4 5 6 7 8 - [EI]
		
		System.out.println(str1.substring(0, 4));  //sele(0, 4)
		System.out.println(str1.substring(4, 8));  //nium(4,8)
	}

}
