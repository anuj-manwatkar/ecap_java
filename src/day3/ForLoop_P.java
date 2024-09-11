package day3;

public class ForLoop_P {

	public static void main(String[] args) {
		//Q. WAP to print numbers from 1 to 10 ?
/*1. Using for loop
  		for(int i = 1; i <11; i++) {
			System.out.println("The numbers from 1 to 10 are : "+i);
		}
*/
		
/*2. Using While loop	
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
*/

//3. Using do-while loop		
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
	}

}
