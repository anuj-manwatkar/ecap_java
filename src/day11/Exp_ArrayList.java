package day11;

import java.util.ArrayList;

public class Exp_ArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add("Anuj");
		al.add(true);
		al.add(10.34f);
		al.add(30);
		al.add(null);
		System.out.println(al);
	}

}


//output => to store dynamic array  we use ArrayList, (10) size
//o/p
//[10, 30, Anuj, true, 10.34, 30, null]
//note: duplicate are allowed, string null value also accepted
//indexing is needed in ArrayList