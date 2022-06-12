package study.ExceptionHandling;

public class Exception_Handling
{

	
	public static void main(String[] args)
	{
		try
		{
			System.out.println(args[0].toUpperCase());
			System.out.println("line after problematic code");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block will always run");
		}
		System.out.println("out side try,catch,finally block");
	}
}
