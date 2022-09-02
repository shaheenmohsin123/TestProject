package te;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Days3 {
	@AfterClass
	public void afterclas()
	{
		System.out.println("AFter executing all methods in the class");
	}
	
	@Test
  public void Weblogincarloan()
  {
	//selenium
	 System.out.println("weblogincar"); 
	 
  }
   
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I will execute after every testmethod in Days3 class");
	}
	
	@Test(enabled=false)
	public void Mobilesignincarloan()
	{
		System.out.println("Mobilesignin");
	}
	@Test(groups= {"Smoke"})
  public void MobileLogincarloan()
  {
	  //Appium
	  System.out.println("mobilelogincar");
  }
  @Test
  public void APIcarloan()
  {
	  System.out.println("Apilogincar");
  }
  @BeforeClass
  public void beforeclas()
  {
	  System.out.println("before any methods in the class");
  }
  
}
