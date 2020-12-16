package com.datastructures.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	public static void main(String args[]) {
		
		Map <String,String> map = new HashMap();

		map.put("MRK", "Saroja");
		map.put("MSK", "Jyothi");
		map.put("MKK", "Harini");
		
		//Extract (key,value) pair via keySet method and print them
			for(String s:map.keySet()) {
				System.out.println(s+":"+map.get(s));
		}
			
		//Extract (key,value) pair via entrySet method and print them
		for(Entry<String, String> e:map.entrySet() ) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		//Extract (key,value) pairs via Iterator
		Iterator<Entry<String, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, String> s = itr.next();
			if (s.getKey().contains("RK"))  
				System.out.println("key="+s.getKey()+",value="+s.getValue());
			}
		
		 //Arraylist Usecase: Create an arraylist of employees with (id,name), Retrieve Id(s) matching name=Sreekanth
		List<Integer> list = new ArrayList();
		list.add(33);
		list.add(3);
		list.add(1);
		list.add(0,4);
		list.add(3); 
		
		System.out.println("Arraylist size="+list.size());
		
		//for(int i:list.size())
		//System.out.println("Array List:"+list.get(index));
		
		for (int i:list)
			System.out.println("Arraylist:"+i);
	 
	for (int i=0;i<list.size();i++)
		System.out.println("Value at Index:"+i+": "+list.get(i));
	}
	}

