package day26;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo5 
{
	@Parameters({"flexiURL","username"})
	@Test
	public void m1(String x,String y)
	{
		System.out.println("M1");
		System.out.println(x);
		System.out.println(y);
	}
	
}
