package study.ExceptionHandling;

public class ExceptionHandlingEx1 {

	public static void main(String[] args) throws Exception {

		f1();
		System.out.println("program ends properly");
		
	}
	public static void f1() throws Exception
	{
		showHeight(-99);
	}
	public static void showHeight(int i) throws Exception 
	{

		if(i>0)
		{
			System.out.println("height of building="+i);
		}
		else
		{
			Exception e = new Exception();
			throw e;
		}
		
		
	}

}
