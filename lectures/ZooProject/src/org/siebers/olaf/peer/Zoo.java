https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package org.siebers.olaf.peer;

public class Zoo {
	private static int numZoosCreated;
	private String location;
	
	public Zoo(){
		this("Unknown");
	}
	
	public Zoo(String location){
		setLocation(location);
		doSomething();
		numZoosCreated++;
	}
		
	public void doSomething(){
		Manager manager=new Manager(this);
		manager.sayHello();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void changeZoo(Zoo zoo, int avgVisitors){
		avgVisitors=200;
		zoo=new Zoo("London");
		//zoo.setLocation("Munic");
		//setLocation("Amsterdam");
	}
	
	public static int getNumZoosCreated(){
		return numZoosCreated;
	}
	
	@Override
	public String toString(){
		return "getClass().getSimpleName(): "+getClass().getSimpleName()+"; getLocation(): "+getLocation();
	}
}

