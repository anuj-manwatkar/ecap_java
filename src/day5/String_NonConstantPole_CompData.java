package day5;

public class String_NonConstantPole_CompData {

	public static void main(String[] args) {
		String str1 = "Anuj";   //without new - Constant pool
		String str2 = new String("Anuj"); //with new - Non-Constant pool
		
		//compare data of two string variables => .equals() method
		if(str1.equals(str2)) {
			System.out.println("Data is Same");
		}else {
			System.out.println("Data is Different");
		}
		//o/p => data is same in this for, if the data is kept same for both (without new & with new keyword) i.e. str1 = Anuj, str2 = Anuj, else different 
		
		//optional code - learning purpose
		//compare address of two string variables => == operator
		if(str1 == str2) {
			System.out.println("Address is Same");
		}else {
			System.out.println("Address is Different");
			//o/p => address is different, even the data is same [because str1 - Without new keyword(Constant pool) & With new Keyword(Non-constant pool)]  
		}

	}

}
