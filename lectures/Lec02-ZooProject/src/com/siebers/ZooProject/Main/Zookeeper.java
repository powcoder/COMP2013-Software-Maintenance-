https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package com.siebers.ZooProject.Main;

public class Zookeeper extends Employee {

	public Zookeeper(String name) {
		super(name);
	}
	
	@Override
	public double getSalary() {
		double baseSalary=super.getSalary();
		return baseSalary+1000.00;
	}

	@Override
	public void promotion() {
		super.setSalary(super.getSalary()*1.1);	
	}
}

