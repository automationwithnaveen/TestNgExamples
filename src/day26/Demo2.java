package day26;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 
{
	
	
	@Test
	public void homePage1()
	{
		System.out.println("This is Home Page");
	}
	
	@Test(groups= {"smoke"})
	public void homePage2()
	{
		System.out.println("This is Home Page2");
	}
	
	@Test
	public void homePage3()
	{
		System.out.println("This is Home Page");
	}
	
	

}
