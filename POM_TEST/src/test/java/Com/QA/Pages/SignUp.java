package Com.QA.Pages;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.QA.Step_Defination.HomePage;
import Com.QA.Utils.TestBase;

public class SignUp extends TestBase {
	
	HomePage home = new HomePage();
	LogIn log = new LogIn(driver);
	
	public SignUp(WebDriver driver){
		this.driver = driver;
		}
	
	By create_new_account = By.xpath("//div[@class='_6ltg']//a[@href='#']");
    By    firstname       = By.xpath("//div[@class='_8fgl _9l2p']//div[@class='clearfix _58mh']//input[@name='firstname']");
    By    surname         = By.xpath("//div[@class='_8fgl _9l2p']//div[@class='clearfix _58mh']//input[@name='lastname']");
    By    mobileNo        = By.xpath("//div[@class='_8fgl _9l2p']//input[@name='reg_email__']");
    By    password        = By.xpath("//div[@class='_8fgl _9l2p']//input[@id='password_step_input']");
   

 
     public String user_is_on_HomePage() throws IOException{
    	return log.HomePage_title();
    	
	}
     
     public boolean new_account_user(){
    	 Set<String> window = driver.getWindowHandles();
    	 System.out.println("No of Windows is..."+window.size());
    	 ArrayList<String> list = new ArrayList<String>(window);
    	 driver.switchTo().window(list.get(0)).close(); 
    	return driver.findElement(create_new_account).isEnabled();
     }
     
     public void user_click_on_button(){
    	 driver.findElement(create_new_account).click();
     }
     
     public String Sign_Up_Page_Title(){
    	 
    	 return driver.getTitle();
    }
     public void user_entering_firstname_surname(String Name, String urname){
    	
    	 driver.findElement(firstname).sendKeys(Name);
    	 driver.findElement(surname).sendKeys(urname);
    	 
    }
     public void user_entering_MobileNo_password(String Mobile, String pass){
     	
    	 driver.findElement(mobileNo).sendKeys(Mobile);
    	 driver.findElement(password).sendKeys(pass);
     }
     public void date_of_birth(){

   WebElement    Date    = driver.findElement(By.xpath("//div[@class='_8fgl _9l2p']//span[@class='_5k_4']//select[@id='day']"));
   WebElement    month   = driver.findElement(By.xpath("//div[@class='_8fgl _9l2p']//span[@class='_5k_4']//select[@id='month']"));
   WebElement    year    = driver.findElement(By.xpath("//div[@class='_8fgl _9l2p']//span[@class='_5k_4']//select[@id='year']"));
    	   
    	 Select sel =  new Select(Date);
    	 sel.selectByIndex(2);
    	 Select sel1 =  new Select(month);
    	 sel1.selectByVisibleText("Apr");
    	 Select sel2 =  new Select(year);
    	 sel2.selectByValue("1993");
     }
        public void clicking_on_Gender(){
        	
        	java.util.List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='radio']"));
        	for(int i=0;i<checkbox.size();i++ ){
        		
        		WebElement box = checkbox.get(i);
        		String gender = box.getAttribute("value");
        		
        		if(gender.equalsIgnoreCase("2")){
        	         box.click();
        	         break;
        		}
        			
        		}
        	}
        	
        }     
     
 
     
