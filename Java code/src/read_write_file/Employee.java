package read_write_file;

import java.io.Serializable;
public class Employee implements Serializable
{
	String Name;
	String Dob;
	String Designation;
	Double Salary;
	String Department;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public Double getSalary() {
		return Salary;
	}
	public void setSalary(Double salary) {
		Salary = salary;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String toString() {
		return "Employee [name=" + Name + ", dob=" + Dob + ", department=" + Department + ", designation=" + Designation + ", salary=" + Salary + "]";
	}
}