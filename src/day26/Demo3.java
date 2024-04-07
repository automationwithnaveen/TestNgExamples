package day26;

import org.testng.annotations.Test;

public class Demo3 
{
	@Test
	public void m1()
	{
		System.out.println("M1");
	}
	
	@Test(groups= {"smoke"})
	public void m2()
	{
		System.out.println("M2");
	}
	
	@Test
	public void m3()
	{
		System.out.println("M3");
	}
	
	@Test
	public void m4()
	{
		System.out.println("M4");
	}
	
	@Test(groups= {"smoke"})
	public void m5()
	{
		System.out.println("M5");
	}
}
