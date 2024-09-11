package day3;

import java.util.Scanner;

public class OneDimesionalArray {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("Enter the Number");
			arr[i]= scan.nextInt();
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("The One Dimenstional Array are : "+arr[i]);
		}

	}

}
