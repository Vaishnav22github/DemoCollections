package com.velocity.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101,"Vaishnav");
		map.put(102,"Sanjay");
		map.put(103,"Patil");
		
		System.out.println(map);
	}

}
