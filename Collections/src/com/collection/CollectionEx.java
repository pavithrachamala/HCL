package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionEx {
	
	public static void main(String args[]) {
		ArrayList<String> list=new ArrayList<>();//creating arraylist
		list.add("pavi");//adding object in arraylist
		list.add("sai");
		list.add("abhi");
		/*System.out.println(list);
		Iterator itr=list.iterator();//traversing list through iterator 
		while (itr.hasNext()) {   //check if iterator has the elements  
		System.out.println(itr.next());*/  //printing the element and move to next 
		for(String name:list) {
			System.out.println(name);
			
		}
	}

}