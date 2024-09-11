package day10;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		try { //try => when may cause problem
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for a");
		int a = scan.nextInt();
		System.out.println("Enter value for b");
		int b = scan.nextInt();
		int c = a / b; //operation
		System.out.println("The result is "+c);
		}catch(Exception e) { //catch => when error occurs Exception object is created and object thrown it, and to catch thrown object, we use catch block 
		System.out.println("The program is terminated");
		System.out.println("The progarm is executed");
		}
	}

}
