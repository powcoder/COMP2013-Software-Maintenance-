https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package com.siebers.CollectionsFramework.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		System.out.println("SWM-Lec02-CollectionFramework");
	}
	
/*
	public static void main(String[] args) {
		LinkedList list=new LinkedList(Arrays.asList("a","b","c",1));
		list.addAll(list);
		list.add("a string");
		String s=(String)list.getFirst();
		System.out.println(list);
	}
*/

/*
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>(Arrays.asList("a","b","c"));
		list.add("a string");
		String s=list.getFirst();
		System.out.println(list+"; "+s);
	}
*/	

/*
	public static void main(String[] args) {
		// names of months
		ArrayList<String> monthNames=new ArrayList<String>(12);
		monthNames.add("Jan");
		monthNames.addAll(Arrays.asList("Feb","Mar","Apr"));
		Iterator<String> iter=monthNames.iterator();
		while(iter.hasNext()){
			String monthName=iter.next();
			System.out.println(monthName);
		}
		Collections.shuffle(monthNames);
		System.out.println(monthNames.toString());
		// number of days in each month
		ArrayList<Integer> monthDay=new ArrayList<>(12);
		monthDay.add(new Integer(31));
		monthDay.add(28);
		Object o=monthDay.get(1);
		System.out.println(o instanceof Integer);
		int febNum=monthDay.get(1);
		System.out.println(febNum);
	}
*/

/*
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.addAll(Arrays.asList("one","one","two","three"));
		System.out.println("List: "+list.toString());
		TreeSet<String> set=new TreeSet<>(list);
		System.out.println("Set:  "+set.toString());
	}
*/
	
/*	
	public static void main(String[] args) {
		HashMap<String,Integer> userData =new HashMap<>();
		userData.put("Emma",30);
		userData.put("Paul",30);
		userData.put("Bernd",25);
		userData.put("Bernd",25);
		userData.put("Sophia",null);
		userData.put("Bernd",26);
		System.out.println(userData);
		Set<String> keys=userData.keySet(); 
		for(String key:keys){
			System.out.println(key+"="+userData.get(key));
		}
	}
*/
	
}
