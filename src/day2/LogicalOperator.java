package day2;

public class LogicalOperator {

	public static void main(String[] args) {
		int a = 11;
		
		//AND-both should true   11>8 && 11<12 => true && true = true
		System.out.println((a > 8) && (a < 12));
		
		//OR-one should true  11>12 || 11<12 => false || true = true
		System.out.println((a > 12) || (a < 12));
		
		//!-reverse the result ! 11>12 || 11<20 => false || true = true i.e. !true = false
		System.out.println(!((a > 2) || (a < 12)));
		
		//similarly = && 
		System.out.println(!((a > 12) && (a < 12)));
		//!    11>12 && 11<12 => false && true = false i.e. !false = true
		

	}

}
