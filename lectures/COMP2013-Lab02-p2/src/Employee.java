https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder
https://powcoder.com
代写代考加微信 powcoder
Assignment Project Exam Help
Add WeChat powcoder

public abstract class Employee implements Employable {
	private int ID;
	private String name; 
	private int salary;
/*	
	public Employee(String name){
		setEmployeeName(name);
	}
*/
	@Override
	public void setEmployeeID(int number) {
		ID = number; // "this." not needed as ID and number have different names
	}

	@Override
	public int getEmployeeID() {
		return ID;
	}

	@Override
	public void setEmployeeName(String name) {
		this.name=name;
	}

	@Override
	public String getEmployeeName() {
		return name;
	}

	@Override
	public void setSalary(int salary) {
		this.salary=salary;
	}

	@Override
	public int getSalary() {
		return salary;
	}
}
