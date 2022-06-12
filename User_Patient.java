package study.isa;

import study.hasa.MyDate;

public class User_Patient
{
	public static void main(String[] args) 
	{
		Patient  []obj = new Patient[2];
		
		obj[0]=new Patient("Nikhil",new MyDate(12, 12,2012),"AB+",80,30);
		obj[1]=new Patient("dijisj",new MyDate(3, 4,2014),"O+",70,34);
		
		System.out.println(obj[0]+" \n"+obj[1]);
		for (int i = 0; i < obj.length; i++) 
		{
		System.out.println(" Name = "+obj[i].getName()+", bP = "+obj[i].getbP());
		}
	}
	
	
}
