package day26;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo1 
{
	@Parameters({"flexiURL"})
	@Test
	public void amethod1(String flexiURL)
	{
		System.out.println("Method 1");
		System.out.println(flexiURL);
	}
	
	@Test
	public void cmethod2()
	{
		System.out.println("Method 2");
	}
	
	@Test
	public void bmethod3()
	{
		System.out.println("Method 3");
	}
	
	@Parameters({"flexiURL","username"})
	@Test
	public void dmethod4(String flexiURL,String username)
	{
		System.out.println("Method 4");
		System.out.println(flexiURL);
		System.out.println(username);
	}
}
