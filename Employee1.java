package study.ExceptionHandling;

import study.ExceptionHandling.custom.Above70Exception;
import study.ExceptionHandling.custom.Under18Exception;
import study.collection.Person;

public class Employee1 implements Comparable<Employee1>
{
	int id;
	String name,department;
	MyDate dob;
	
	
	public Employee1(int id,String name, String department, MyDate dob) {
		super();
		this.id=id;
		this.name = name;
		this.department = department;
		this.dob = dob;
	}

	public Employee1() {}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public MyDate getDob() {
		return dob;
	}
	
	
//	public int compareTo(Employee1 a)
//	{
//		return this.getName().compareTo(a.getName());
//	}
	
	@Override
	public boolean equals(Object obj) {
		Employee1 o= (Employee1)obj;
		if(this.name.equals(o.name))
		{
			return true;
		}
		return false;
		
		
	}

//	public void setDob(MyDate dob) throws Under18Exception,Above70Exception
//	{
//		if(2022-dob.getYear()>=18)
//		{
//		this.dob = dob;
//		}
//		else
//		{
//			throw new Under18Exception();
//		}
//		if(2022-dob.getYear()<=70)
//		{
//		this.dob = dob;
//		}
//		else
//		{
//			throw new Above70Exception();
//		}	
//	}


	@Override
	public String toString() {
		return "id ="+ this.id
				+ "name=" + this.getName()+
				", department=" + this.getDepartment()+
				", dob=" + dob.getDay()+"-" +dob.getMonth()+"-"+dob.getYear()+ "]";
	}

@Override
public int compareTo(Employee1 o) {
	return this.getName().compareTo(o.getName());
}
	
	
	
	
}
