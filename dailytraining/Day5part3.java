package com.example.demo.dailytraining;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//Iterating HashMaps
public class Day5part3 {
	public static void main(String[] arguments) {
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "RK");
		hash_map.put(2, "PK");
		hash_map.put(3, "CK");

		// iterator

		Iterator<Entry<Integer, String>> it = hash_map.entrySet().iterator();
		System.out.println("Iterating Hashmap below:");
		System.out.println("keys"+"\t"+"values");
		while (it.hasNext()) {
			Map.Entry<Integer, String> set = (Map.Entry<Integer, String>) it.next();
			
			System.out.println(set.getKey() +"\t"+ " = " + set.getValue());
		}
	}
}