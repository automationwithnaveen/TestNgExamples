package day26;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTests 
{
	@BeforeClass
	public void sample()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void openwebsite()
	{
		System.out.println("https://www.flexiquiz.com/");
	}
	
	@Test
	public void homePage()
	{
		System.out.println("This is Home Page");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Will close Bro");
	}
	
	@AfterClass
	public void show()
	{
		System.out.println("After class");
	}
}
