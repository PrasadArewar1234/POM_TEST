package Com.QA.Utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;

public class TestBase {
	
	public static WebDriver driver ;
	protected static Properties prop ;
	
	public TestBase(){
		
		BufferedReader reader;
		String PropertyFilePath = "F:\\Selennium\\POM_TEST\\src\\main\\java\\Com\\QA\\Config\\Config.properties";
		try{
		reader = new BufferedReader(new FileReader(PropertyFilePath));
		prop = new Properties();
		try{
			prop.load(reader);
			reader.close();
			}catch(IOException e) {
				 e.printStackTrace();
				 }
		}catch(FileNotFoundException e) {
			 e.printStackTrace();
		}
	}
	
	public void Initialization(){
		
		System.setProperty("webdriver.chrome.driver","//C:\\Users\\lenovo\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		option.addArguments("--disable-gpu");
		option.addArguments("--disable-browser-side-navigation");
		driver = new ChromeDriver(option);
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestUtiles.PageLoadTime,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtiles.ImpliciteWait,TimeUnit.SECONDS);
		
	}
	
	public void Screenshot(String MethodName) throws IOException{
		
		TakesScreenshot src = (TakesScreenshot)driver;
		File file = src.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("F:\\Selennium\\POM_TEST\\Screenshot\\"+MethodName+".jpg"));
				
          }

	}
