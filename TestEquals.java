package study.isa;

import study.hasa.MyDate;
import study.hasa.TechnicalBook;

public class TestEquals {

	public static void main(String[] args) 
	{
	//my name is nikhil
	
	TechnicalBook t1 = new TechnicalBook("nikhil",500.0,new MyDate(12,12,2012),new String[]{"udghuaid","srgerg"});	
	TechnicalBook t2 = new TechnicalBook("nikhil",500.0,new MyDate(12,12,2012),new String[]{"udghuaid","srgerg"});	
	
	if(t1.equals(t2))
		System.out.println(t1+ "\nis same as \n"+t2);
	else
		System.out.println(t1+ "\nis not same as \n"+t2);
	
/*		
  		MyDate birthDayOfJeetu = new MyDate(12, 12,2012);
		MyDate birthDayOfNeetu = birthDayOfJeetu ;
		MyDate birthDayOfNeetu = new MyDate(1, 1,2011);
		MyDate birthDayOfNeetu = new MyDate(12,12,2012);
		
		if(birthDayOfJeetu.equals(birthDayOfNeetu))
			System.out.println(birthDayOfJeetu+ "is same as "+birthDayOfNeetu);
		else
			System.out.println(birthDayOfJeetu+ "is not same as "+birthDayOfNeetu);
*/		
	}
}
