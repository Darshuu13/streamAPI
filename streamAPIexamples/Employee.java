package streamAPIexamples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Employee {
	private String name;

	private double salary;

	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Employee(String name, double salary, String gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
	}



}
