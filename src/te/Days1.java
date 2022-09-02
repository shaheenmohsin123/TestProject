package te;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Days1 {

	
		// TODO Auto-generated method stub
	@AfterSuite
	public void aftsuite()
	{
	  System.out.println("I am no 1 from last");
	}
	
	@AfterTest
	   public void lastexecution()
	   {
		   System.out.println("I will execute last");
	   }
	@Test(groups= {"Smoke"})
	public void Demo()
	{
		System.out.println("hello");
		Assert.assertTrue(false);
	}
    
    @Test
    public void SecondTest()
    {
    	System.out.println("bye");
    
    }
  @BeforeSuite
  public void bfsuite()
  {
	System.out.println("I am no 1"); 
  }
}
