https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package org.siebers.olaf.peer;

public class ZooApp {
	
	public static void test(){
		System.out.println("This is a test.");
	}

	public static void main(String[] args) {
		int avgVisitors=100;
		
		Zoo zoo1;
		zoo1=new Zoo("Hamburg");
		zoo1=new Zoo("Munic");
		Zoo zoo2=zoo1;
		Zoo zoo3=new Zoo();
		System.out.println(zoo1.toString());
		System.out.println(zoo2.toString());
		System.out.println(zoo3.toString());
		zoo3.setLocation("Berlin");
		zoo1.setLocation("Berlin");
		System.out.println(zoo1.toString());
		System.out.println(zoo2.toString());
		System.out.println(zoo3.toString());
		zoo1.changeZoo(zoo1, avgVisitors);
		System.out.println(zoo1.toString()+"; avgVisitors: "+avgVisitors);
		System.out.println("getNumZoosCreated(): "+Zoo.getNumZoosCreated());
		test();
	}
}


