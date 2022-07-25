package Listener.Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	static WebDriver driver;
	
	
	public void initialisation(){
		
		System.setProperty("webdriver.chrome.driver","//C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");  
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		}
	
	public void fail(String MethodName) throws IOException{
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		// By class Name: 
		
		//	 FileUtils.copyFile(file,new File("F:\\Selennium\\Listeners\\Screenshot\\"+
	//	this.getClass().getName()+".jpg"));
	
		//	By Method Name:
		
	FileUtils.copyFile(file,new File("F:\\Selennium\\Listeners\\Screenshot\\"+
					MethodName+".jpg"));
	}

}
