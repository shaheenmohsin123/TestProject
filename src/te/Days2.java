package te;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Days2 {

	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}

	@BeforeTest
	public void prerequiste()
	{
	  System.out.println("I will execute first");	
	}

}

