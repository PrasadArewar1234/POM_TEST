package Com.QA.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Com.QA.Utils.TestBase;

public class LogIn extends TestBase {
	
	public LogIn(WebDriver driver){
		
		this.driver = driver ;
}
    By email = By.name("email");
    By pass  = By.name("pass");
    By logIn = By.xpath("//button[@name='login']");
    
    
    public void usename(){
    	
    	driver.findElement(email).sendKeys(prop.getProperty("user"));
    }
    
    public void password(){
    	
    	driver.findElement(pass).sendKeys(prop.getProperty("password"));
    }
 
    public boolean button_Enable(){
    	
    	return driver.findElement(logIn).isEnabled();
    	
    }
    public void button(){
    	
    	driver.findElement(logIn).click();
    }
    
    public String login_title(){
    	
    	return driver.getTitle();
    	 }
    
    public String HomePage_title(){
    	
    	return driver.getTitle();
    	
    	
    	
    }
}
