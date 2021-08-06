package CommonFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.reporters.TestHTMLReporter;
import org.yaml.snakeyaml.events.AliasEvent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class commonfunctions {
	public static WebDriver driver=null;
	public static Properties properties=null;
	protected static ExtentReports extentreport;	
	ExtentSparkReporter AliasEvent;
	ExtentTest testcase;
	
	public Properties loadproperty() throws IOException {
		
		FileInputStream fileinputstream= new FileInputStream("config.properties");
		//FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\config.properties");
		Properties properties=new Properties();
		properties.load(fileinputstream);
		return properties;
		
	}
	
	@BeforeSuite
	public void launchbrowser() throws IOException {
		
		properties=loadproperty();		
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driverlocation=properties.getProperty("driverlocation");		
		  if(browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver",driverlocation); 
		  extentreport=new ExtentReports();
		  AliasEvent=new ExtentSparkReporter("ExtentReport.html");
		  extentreport.attachReporter(AliasEvent);
		  driver = new ChromeDriver();		  
		  }
		 
		driver.manage().window().maximize();
		//testcase=extentreport.createTest("Verify Login");
		driver.get(url);
	}
	
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		extentreport.flush();
		
	}
	
	
	

}
