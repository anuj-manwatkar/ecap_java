package day4;

import java.util.Scanner;

public class Jagged_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);   //User input => Scanner class
		int arr[][] = new int[3][];   //Jagged array => declaration 
		
		arr[0] = new int[2];   //Initializing size => column of given rows
		arr[1] = new int[3];
		arr[2] = new int[4];
		
		for(int i = 0; i < arr.length; i++) {  //i => represents rows
			for(int j = 0; j < arr[i].length; j++) {  //j => represents column
				System.out.print("Enter the number for ["+i+"] th row ["+j+"] th column : ");
				arr[i][j] = scan .nextInt();   //Strong User Data => .nextInt() method
			}
		}
		System.out.println(); //new line
		
		System.out.println("The Entered Elements Array for row & column are : ");
		for(int i = 0; i < arr.length; i++) {   //i = rows
			for(int j = 0; j < arr[i].length; j++) { //j = column
				System.out.print("["+arr[i][j]+"]"); //printing result
			}
			System.out.println(); //after executing each row, move to next line 
		}
	scan.close();   //Scanner class close => Protect form data lose
	}

}
