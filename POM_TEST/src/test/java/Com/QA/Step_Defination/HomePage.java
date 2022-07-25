package Com.QA.Step_Defination;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.QA.Pages.LogIn;
import Com.QA.Utils.Listners;
import Com.QA.Utils.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

@Listeners(Listners.class)
public class HomePage extends TestBase {

	
	TestBase base = new TestBase();
	LogIn login = new LogIn(driver);
	
   @Before
		public void start(){
		System.out.println("HomePage Start....");	
		base.Initialization();
		}
	   
	   @After
		public void stop(){
		System.out.println("HomePage Quit....");
			driver.quit();
			
		}
	
    @Test
	@Given("^User is on Homepage of facebook$")
	public void user_is_on_Homepage_of_facebook() throws IOException {
     String HomePageTitle = login.HomePage_title();
     assertEquals(HomePageTitle,"Facebook – log in or sign up");
        System.out.println("Home Page Title is...."+HomePageTitle);
	   
	}

	
	@Then("^User Typing UserName$")
	public void user_Typing_UserName() {
		login.usename();
		System.out.println("User Typing UserName....");
	    
	}

	@And("^User Typing Password$")
	public void user_Typing_Password()  {
		login.password();
		System.out.println("User Typing Password....");
	}

	@Then("^Validating LogIn Button is Enable$")
	public void validating_LogIn_Button_is_Enable() {
		boolean button = login.button_Enable();
		System.out.println(" LogIn Button is Enable...."+button);
		assertEquals(button,true);
		System.out.println("Validating LogIn Button is Enable....");
	}

	@Then("^Clicking on LogIn Button$")
	public void clicking_on_LogIn_Button() {
		login.button();
		
	   System.out.println("Clicking on LogIn Button");
	}

	@Then("^Validating LogIn Page Title$")
	public void validating_LogIn_Page_Title() throws InterruptedException  {
		
		String LogIn_Page_Title = login.login_title();
		System.out.println("LogIn Page Title is..."+LogIn_Page_Title);
	
		assertEquals(LogIn_Page_Title,"Facebook – log in or sign up");
		}

	@Then("^Validating UserName$")
	public void validating_UserName() {
		System.out.println("Validating UserName....");
}
	
	

}
