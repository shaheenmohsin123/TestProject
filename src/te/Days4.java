package te;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Days4 {
    
	@Test
	  public void Webloginhomeloan()
	  {
		//selenium
		 System.out.println("webloginhome"); 
	  }
	  @Test(groups= {"Smoke"})
	  public void MobileLoginhomeloan()
	  {
		  //Appium
		  System.out.println("mobileloginhome");
	  }
	  @Test
	  public void LoginAPIhomeloan()
	  {
		  System.out.println("LoginApihome");
		 
	  }
	 @Test(dataProvider= "getData")
	 public void shaheenMOHSIN(String username, String password)
	 {
		 System.out.println("NIS");
		 System.out.println("username");
		 System.out.println("password");
	 }
	  
	  @DataProvider
	  public Object[][] getData()
	  {
		  Object[][] data=new Object[3][2];
		  data[0][0] = "firstsetusername";
		  data[0][1] = "password";
		 
		  data[1][0] = "secondsetusername";
		  data[1][1] = "secondpassword";
		  
		  data[2][0] = "thirdsetusername";
		  data[2][1] = "third password";
		  
		  return data;
				  
	  }
	  
}
