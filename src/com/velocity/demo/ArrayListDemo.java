package com.velocity.demo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Vaishnav");
		list.add("Sanjay");
		list.add("Patil");
		
		for(String s : list) {
		System.out.println(s+"Vaishnav");
		System.out.println(s+"123");
		System.out.println(s+"Patil");
		System.out.println("Hello");
		System.out.println("All");

	}
  }
}
