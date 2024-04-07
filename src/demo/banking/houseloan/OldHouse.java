package demo.banking.houseloan;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OldHouse 
{
	@BeforeTest
	public void m1()
	{
		System.out.println("Before House Test");
	}
	
	@AfterTest
	public void m2()
	{
		System.out.println("After House Test");
	}
}
