package demo.banking.carloan;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewCar 
{
	@BeforeSuite
	public void sample()
	{
		System.out.println("Please open HSBC website");
	}
	
	@Test
	public void registration()
	{
		System.out.println("New Car Registration");
	}
	
	
	@AfterSuite
	public void sample1()
	{
		System.out.println("Please close HSBC website");
	}
	
	
	@BeforeClass
	public void newcar()
	{
		System.out.println("Before New Car");
	}
	
	@AfterClass
	public void newcar1()
	{
		System.out.println("After New Car");
	}
	
}
