package study.isa;

public class TestInheritanceConcept
{
	public static void main(String[] args) 
	{
	// Alpha obj = new Gama();
//	 Beta obj = new Gama();
//		Gama obj = new Gama();
//	 obj.fb();
//	 obj.f1();
//	 show(new Object());	
//	 show(new Person());
		
		test(new Beta());
		test(new Alpha());
		test(new Theta());
		test(new Gama());
		test(new Delta());
		
	}//end of main
	public static void test(Alpha obj)
	{
		obj.f1();
		obj.fa();
		if(obj instanceof Beta)
		((Beta)obj).fb();
	}
	public static void show(Object obj)
	{
		String s = obj.toString();
		System.out.println("S="+s);
	}
	
	public static void doJob(Alpha obj)
	{
		obj.fa();
		obj.f1();
	}
	
	public static void doJob(Beta obj)
	{
		obj.fa();
		obj.f1();
	}
	
	public static void doJob(Theta obj)
	{
		obj.fa();
		obj.fb();
		obj.fc();
		obj.f1();
	}
	
	public static void doJob(Gama obj)
	{
		obj.fa();
		obj.fb();
		obj.fc();
		obj.fd();
		obj.f1();
	}
	
	
	
	public static void doJob(Delta obj)
	{
		obj.fa();
		obj.fb();
		//obj.fc();
		//obj.fd();
		obj.ff();
	}
}//end of class
class Alpha
{public void fa(){
	System.out.println("Alpha");}

public void f1() {
	System.out.println("Alpha f1");
	
}
	
}
class Beta extends Alpha{
	public void fb(){
		System.out.println("Beta");}

	public void f1() {
		System.out.println("Beta f1");
		
	}
	}


class Theta extends Beta{
	public void f1() {
		System.out.println("Theta f1");
		
	}
	public void fc(){
		System.out.println("Theta");
}
	
}
class Gama extends Theta{
	public void f1() {
		System.out.println("Gama f1");
		
	}
	public void fd(){
		System.out.println("Gama");
}
}

class Delta extends Beta
{
	public void ff()
	{
		System.out.println("Delta");
	}
}
