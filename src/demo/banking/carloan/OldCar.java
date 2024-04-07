package demo.banking.carloan;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OldCar 
{
	public void mylogic()
	{
		int a,b;
		a = 10;
		b = 20;
				
		System.out.println(a+b);
	}
	
	
	@BeforeTest
	public void m1()
	{
		System.out.println("Before Car Test");
		mylogic();
	}
	
	@AfterTest
	public void m2()
	{
		System.out.println("After Car Test");
	}
	
	@BeforeClass
	public void newcar()
	{
		System.out.println("Before OLD Car");
	}
	
	@AfterClass
	public void newcar1()
	{
		System.out.println("After OLD Car");
	}
	
	@Test
	public void registration()
	{
		System.out.println("OLD Car Registration");
	}
}
