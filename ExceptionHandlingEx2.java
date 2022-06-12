package study.ExceptionHandling;

import java.io.IOException;

public class ExceptionHandlingEx2 {


	public static void main(String[] args)  {

		//f1();
		try {
			showSquareNumber("20");
		}catch(NumberFormatException e)
		{
			System.out.println(" number is needed");
		}
		System.out.println("programs ends properly");

	}

	public static void f1() 
	{
		try {
			showHeight(88);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void showHeight(int x) throws Exception
	{
		if(x > 0) System.out.println("height of building ="+x);
		else
		{
			Exception e = new Exception();
			throw e;
		}		
	}


	public static void showSquareNumber(String s) 
	{
		int x = Integer.parseInt(s);  //Unchecked!!! compiler is not forcing to RETRHOW or CATCH 
		System.out.println(x*x);
	}

	public static void test()
	{
		throw new ArithmeticException();  //UNCHECKED 
	}

	public static void test2() throws IOException 
	{
					throw new IOException();  //CHECKED 
	}


}
