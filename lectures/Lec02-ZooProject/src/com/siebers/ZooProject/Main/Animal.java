https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
package com.siebers.ZooProject.Main;

public abstract class Animal implements Maintainable {
	private String name;

	public Animal(String name) {
		this.setName(name);
	}
	
	public abstract void eat();
	
	public void enjoy() {
		System.out.println(this.getClass().getSimpleName()+" enjoys life as animal.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

