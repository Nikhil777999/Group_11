package study.isa;

import study.hasa.MyDate;

public class Person {
	
	public String name;
	public MyDate dob;

	public Person(String name, MyDate dob) {
		super();
		this.name = name;
		this.dob = dob;
		//System.out.println("parameterized constructor");
	}

	public Person()
	{
		System.out.println("Person is created");
	}

	public boolean equals(Object a)
	{
		Person tmp = (Person)a;
		if(a instanceof Person)
		{
			if(this.name.equals(tmp.name) && this.dob.equals(tmp.dob))
				return true;
			else
				return false;
		}
		else 
			return false;
	}
	
	public String  getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}
	
	public void show()
	{
		System.out.println(name+" "+dob.getDay()+"-"+dob.getMonth()+"-"+dob.getYear());
	}

	@Override
	public String toString() 
	{
		String str= "Person = [name = " + name + ", dob = " + dob.getDay()+"-"+dob.getMonth()+"-"+dob.getYear()+"]\n";
		return str;
	}
	
	
}
