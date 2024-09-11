package day5;

public class String_NonConstantPole_CompAdd {
	
	public static void main(String[] args) {
	//Comparing address of two string variables => == operator
		
		String str1 =  new String("Aarvi"); //with new keyword => Non constant pole, duplicate allow i.e. str1=("Aarvi")2000, str2=("Aarvi")3000 
		String str2 = new String("Aarvi");
		
		if(str1 == str2) {
			System.out.println("Address is Same");
		}else {
			System.out.println("Address is Different");
		}

	}

}
