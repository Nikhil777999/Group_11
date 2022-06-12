package study.isa;

import study.hasa.MyDate;

public class PartTimeEmployee extends Empolyee
{
	int numberOfHours;
	
	public PartTimeEmployee() {	}
	
	public PartTimeEmployee(int numberOfHours,String name, MyDate dob, int empid, int salary, String deptment)
	{
		super(name,dob,empid,salary,deptment);
		this.numberOfHours = numberOfHours;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	@Override
	public String toString() 
	{
		return super.toString()+"PartTimeEmployee = [Number Of Hours = " + numberOfHours+ "hours ]\n";
	}
	
	
}
