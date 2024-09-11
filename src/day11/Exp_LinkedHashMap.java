package day11;

import java.util.LinkedHashMap;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Exp_LinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("sachin", 57);
		lhm.put("divya", 67);
		lhm.put("aarti", 89.76);
		lhm.put("diya", 89);
		lhm.put("diya", 89); //duplicates are not allowed
		System.out.println(lhm);

	}

}

//Output => Order of insertion either use [LinkedHashMap / LinkedHashMap]

//o/p
//{sachin=57, divya=67, aarti=89.76, diya=89}
//note: duplicates are not allowed
