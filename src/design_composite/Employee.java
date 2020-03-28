package design_composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	// 姓名
	private String name;
	// 销售部
	private String dept;
	// 薪水
	private String salary;
	// 下级
	private List<Employee> subordinates ;

	public Employee() {
		super();
		subordinates = new ArrayList<Employee>();
	}

	public Employee(String name, String dept, String salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public String toString() {
		return "Employee : [Name:" + name + "  dept: " + dept + ", salary:" + salary + "]";
	}

}
