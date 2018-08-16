package org.jenith.main;

import java.util.HashMap;
import java.util.Set;

import lombok.Data;

public class MyObjectKeySearch {
	public static void main(String a[]) {
		HashMap<Price, Price> hm = new HashMap<>();
		hm.put(new Price("Banana", 20), new Price("Banana", 20));
		hm.put(new Price("Apple", 40),new Price("Banana", 40));
		hm.put(new Price("Orange", 30), new Price("Banana", 30));
		printMap(hm);
		Price key = new Price("Banana", 210);
		System.out.println("Does key available? " + hm.containsKey(key));
	}

	public static void printMap(HashMap<Price, Price> map) {
		Set<Price> keys = map.keySet();
		for (Price p : keys) {
			System.out.println(p + "==>" + map.get(p));
		}
	}
}

@Data
class Price {
	private String item;
	private int price;

	public Price(String itm, int pr) {
		this.item = itm;
		this.price = pr;
	}
}