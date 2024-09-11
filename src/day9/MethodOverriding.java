package day9;

class Bank{
	//Methods Overloading - Inheritance(Hierarchy)
	
	int getROI() {    //Definition //Signature //Method => should be same
		return 0;     //Implementation => should be different
	}
}
class SBI extends Bank{
	int getROI() {   //Definition //Signature //Method => should be same
		return 10;   //Implementation => should be different
	}
}
class ICICI extends Bank{
	int getROI() {   //Definition //Signature //Method => should be same
		return 15;   //Implementation => should be different
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		SBI sbiobj = new SBI();
		System.out.println(sbiobj.getROI());
		ICICI iciciobj = new ICICI();
		System.out.println(iciciobj.getROI());
		
		//optionally - if wanted to print the Parent 
		Bank ban = new Bank();
		System.out.println(ban.getROI());
	}

}
