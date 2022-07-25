package Com.QA.Step_Defination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.Test;

import Com.QA.Pages.LogIn;
import Com.QA.Pages.SignUp;
import Com.QA.Utils.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignUpPage extends TestBase{
	
	
	
	SignUp sign = new SignUp(driver);
	
//	 @Before
//		public void start(){
//		 System.out.println("SignUp Page Start....");	
//		base1.Initialization();
//		
//		}
//	   
//	   @After
//		public void stop(){
//		System.out.println("SignUp Page Quit....");
//			driver.quit();
//			
//		}
//	   
	   @Test
	   @Given("^user is on HomePage$")
	   public void user_is_on_HomePage() throws IOException {
	    String Home = sign.user_is_on_HomePage();
	      System.out.println("Home Page Title is..."+Home);
	      assertEquals(Home,"Facebook – log in or sign up");
		  
	   }


	@Then("^validate the button create new account is enable$")
	   public void validate_the_button_create_new_account_is_enable() {
		boolean AccountEnable = sign.new_account_user();
		System.out.println("Account Enable is..."+AccountEnable);
		assertEquals(AccountEnable,true);
	       
	   }

	   @Then("^user click on button create new account$")
	   public void user_click_on_button_create_new_account() throws InterruptedException {
	       sign.user_click_on_button();
	       Thread.sleep(3000);
	   }

	   @Then("^Validate the SignUp Page title$")
	   public void validate_the_SignUp_Page_title(){
		   String SignUpTitle = sign.Sign_Up_Page_Title();
		   System.out.println("SignUp Title is..."+SignUpTitle);
		   assertEquals(SignUpTitle,"Facebook – log in or sign up");
	       
	   }

	   @Then("^User Entering \"([^\"]*)\" and \"([^\"]*)\"$")
	   public void user_Entering_and(String firstName, String Surname) {
		   sign.user_entering_firstname_surname(firstName, Surname);
	      
	   }
	   
	   @Then("^User Wrighting \"([^\"]*)\" and \"([^\"]*)\"$")
	   public void user_Wrighting_and(String MobileNo, String Password){
		   sign.user_entering_MobileNo_password(MobileNo, Password);
	        }
	   @Then("^User giving Date Of Birth$")
	   public void user_giving_Date_Of_Birth() {
		   sign.date_of_birth();
	       
	   }

	   @Then("^User Giving Gender$")
	   public void user_Giving_Gender(){
	      sign.clicking_on_Gender();
	   }


}
