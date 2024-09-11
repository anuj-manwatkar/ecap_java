package day11;

import java.util.HashSet;

public class Exp_HashSet {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(40);
		hs.add(60);
		hs.add(50);
		hs.add(null);
		hs.add("Anuj");
		hs.add(50);
		hs.add(50.77);
		System.out.println(hs);
		

	}

}


//output => data stores randomly based on hashing formula (16) size
//o/p 
//[50, 40, 10, 60]
//note: data is stored randomly based on HashSet Formula 

//[null, 50, 40, 10, 60, Anuj, 50.77]
//duplicates are not allowed, null value accepted, string accepted, float value accepted