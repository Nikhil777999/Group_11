package study.ExceptionHandling;

import study.ExceptionHandling.custom.Above70Exception;
import study.ExceptionHandling.custom.Under18Exception;

public class User
{

	public static void main(String[] args) 
	{
		
		Employee1 e1 =new Employee1();
		
		e1.setName("Nikhil");
		e1.setDepartment("Devlopment");
		
		try 
		{
			e1.setDob(new MyDate(12,12,1930));
		} 
		catch (Under18Exception |Above70Exception e) 
		{
			System.out.println(e.toString());
			
			e.printStackTrace();
		}
	
		
	}

}
