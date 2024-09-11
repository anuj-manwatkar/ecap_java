package day5;

public class String_ConstantPole_CompAdd {

	public static void main(String[] args) {
		String str1 = "Aarvi";
		String str2 = "Aarvi";
		
		//compare address of two string variables => == operator
		if(str1 == str2) { 			
			System.out.println("Same Address : i.e. 1000");
		}else {
			System.out.println("Differenet Address : i.e. 2000");
		}
	}

}
