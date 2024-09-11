package day11;

import java.util.HashMap;

public class Exp_HashMap {
	public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put("Anuj", 90);
	hm.put("Anuj", 98); //key must be unique, value can be duplicate , If key is same then without caring value it will print once only
	hm.put("A", 77.6); //If key is unique, then it will store value individual for both key, data might be whatever duplicate allowed
	hm.put("Virat", 97);
	hm.put("Harsh",90);
	hm.put("Mithilesh",85);
	hm.put("Ayush",78);
	System.out.println(hm);

	}

}

//Output => stores key value pair, randomly stored based on Hashing formula, for calculating address of memory location
//o/p 
//{Mithilesh=85, Harsh=90, Anuj=98, Ayush=78, Virat=97}
//note: 1. key must be unique, value can be duplicate , If key is same then without caring value it will print once only

//o/p
//{A=76, Mithilesh=85, Harsh=90, Anuj=98, Ayush=78, Virat=97}
//note: 2. If key is unique, then it will store value individual for both key, data might be whatever duplicate allowed
