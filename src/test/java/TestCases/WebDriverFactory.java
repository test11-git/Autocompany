package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
	
	static WebDriverFactory webDriverFactory=null;
	static WebDriver driver=null;
	
	private WebDriverFactory()
	{
		driver= new ChromeDriver();
		//driver.
		
	}
	
	
	public static WebDriver getInstance()
	{
		if(webDriverFactory==null)
		{
			webDriverFactory=new WebDriverFactory();
		}
		return driver;
	}
}
