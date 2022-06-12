package study.isa;
// Changes made by pankaj.........
//Hello Nikhil
import study.hasa.MyDate;

public class Empolyee extends Person {
	
	int Empid;
	int Salary;
	String Deptment;
	
	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getDeptment() {
		return Deptment;
	}

	public void setDeptment(String deptment) {
		Deptment = deptment;
	}

	public Empolyee()
	{
		System.out.println("Empolyee is created");
	}

	public void show() {
		
		super.show();
		System.out.println(Empid+" "+Salary+" "+Deptment);
	}
	
	public Empolyee(String name, MyDate dob, int empid, int salary, String deptment) {
		super(name, dob);
		Empid = empid;
		Salary = salary;
		Deptment = deptment;
	//	System.out.println("parameterized constructor");

		
		
	}

	@Override
	public String toString() 
	{
		return super.toString()+"Empolyee = [Empid = " + Empid + ", Salary = " + Salary + ", Deptment =" + Deptment + "]\n";
	}
	
}
