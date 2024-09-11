package day10;

import java.util.Scanner;

public class Normal_Exception {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for a");
		int a = scan.nextInt();
		System.out.println("Enter value for b");
		int b = scan.nextInt();
		int c = a/b; //operation
		System.out.println("The result is "+c);
		System.out.println("The program is terminated");
	}

}

//o/p => 12 / 4 => 3
//o/p => 12 / aa => Input Mismatched
//o/p => 10 / 0 => Arithmetic Exception
