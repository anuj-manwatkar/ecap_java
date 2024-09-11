package day11;

import java.util.LinkedHashSet;

public class Exp_LinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(50);
		ls.add(60);
		ls.add(60); //duplicates are not allowed
		ls.add(null);
		ls.add("Anuj");
		ls.add(65.77);
		System.out.println(ls);

	}

}

//Output => Order of insertion 
//o/p
//[10, 20, 30, 50, 60]


//[10, 20, 30, 50, 60, null, Anuj, 65.77]
//duplicates are not allowed, null value accepted, string data accepted, float value accepted