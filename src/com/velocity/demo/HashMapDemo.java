package com.velocity.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(101,123123);
		map.put(102,321311);
		map.put(103,456321);
		
		System.out.println(map);
	}
}

