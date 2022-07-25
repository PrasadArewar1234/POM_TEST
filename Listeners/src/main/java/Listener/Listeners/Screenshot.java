package Listener.Listeners;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;





@Listeners(CustomListner.class)
public class Screenshot extends base{
	
	
	
	@BeforeTest
	public void Setup(){
		
		initialisation();
	}
	
	
	@AfterTest
	public void Teardown(){
		
		driver.quit();
	}
	
	@Test
	public void homePage(){
		
		assertEquals("prasad", "arewar");
	}
	
	

}
