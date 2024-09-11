package day6;

public class Exp_String_Method1 {

	public static void main(String[] args) {
		String str1 = "Anuj";
		String str2 = "anuj";
		
		//To ignore the cases for(whether capital or small) => equalsIgnoreCase()
		if(str1.equalsIgnoreCase(str2)) {  
			System.out.println("Data is Same");
		}else {
			System.out.println("Data is Different");
		}

	}

}
