package day4;

import java.util.Scanner;

public class TwoDimensional_array_UserI {

	public static void main(String[] args) {
		
		int arr[][] = new int[2][2];
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arr.length ;i++) {   //hard coded condition => i < 2
			for(int j = 0; j < arr[i].length; j++) {   //arr[i].length = here arr[i] - go to row & .length - and calculate the column
				//System.out.println("Enter the "+i+" "+j+" Index Element Number");
				System.out.print("Enter the element ["+i+"]["+j+"] : ");
				arr[i][j] = scan.nextInt();
			}
			
		}
		
		System.out.println("The Element of Array are : ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
			//System.out.println("The 2 Dimensional Array will be : "+arr[i][j]);
			System.out.print(arr[i][j]+"  ");
			}
			System.out.println(); // Move to the next line after each row
		}
		scan.close();
	}

}
