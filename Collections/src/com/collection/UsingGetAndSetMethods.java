package com.collection;

import java.util.ArrayList;

public class UsingGetAndSetMethods {
	
	public static void main(String args[]) {
		ArrayList<String> list=new ArrayList<>();
		list.add("sai");
		list.add("pavi");
		list.add("arya");
		System.out.println(list.get(1));  //it will return the 2nd element, because index starts from 0
		list.set(1, "surya");   //changing the element
		for(String name:list) {
			System.out.println(name);
		}
	}

}
