package day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleException {
	public static void main(String[] args) {
		try {  //cause the error
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5]; //Array Declaration and Initialization
		System.out.println("Enter value for a");
		int a = scan.nextInt();
		System.out.println("Enter value for b");
		int b = scan.nextInt();
		int c = a / b; //operation
		System.out.println("The result is "+c);
		System.out.println("Enter array index");
		int index = scan.nextInt(); //The scan.nextInt() method reads the integer input from the user and stores it in the variable index. //suppose you enter 2
		arr[index] = 5;  //Assign the value 5 to the element 2 in an array //e.g. 2 so arr[2] = 5 , [0, 0, 5, 0, 0]
		System.out.println("Program terminated normally");
		} catch(InputMismatchException e) {
			System.out.println("Input Mismatched Exception");
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Exception");
		} catch(Exception e) {
			System.out.println("Parent Exception occurs: Program is normal");
		}
		System.out.println("Rest of the code");
	}

}
