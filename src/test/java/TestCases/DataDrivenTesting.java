package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonFunctions.commonfunctions;
import PageObjects.Login_Page_Objects;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTesting extends commonfunctions {
	

	@Test(dataProvider="testdata")
	public void login(String Username,String Password) throws InterruptedException{
		//String Username,String Password
		WebDriver driver=WebDriverFactory.getInstance();
		PageFactory.initElements(driver, Login_Page_Objects.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Login_Page_Objects.username.sendKeys(Username);
		Login_Page_Objects.password.sendKeys(Password);
		Login_Page_Objects.login.click();
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	public void createNewUser(String Username,String Password) throws InterruptedException{
		//String Username,String Password
		WebDriver driver=WebDriverFactory.getInstance();
		//WebDriver driver=new ChromeDriver();
		PageFactory.initElements(driver, Login_Page_Objects.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Login_Page_Objects.username.sendKeys(Username);
		Login_Page_Objects.password.sendKeys(Password);
		Login_Page_Objects.login.click();
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	public void validateUser(String Username,String Password) throws InterruptedException{
		//String Username,String Password
		WebDriver driver=new ChromeDriver();
		PageFactory.initElements(driver, Login_Page_Objects.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Login_Page_Objects.username.sendKeys(Username);
		Login_Page_Objects.password.sendKeys(Password);
		Login_Page_Objects.login.click();
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	public void logout(String Username,String Password) throws InterruptedException{
		//String Username,String Password
		WebDriver driver=new ChromeDriver();
		PageFactory.initElements(driver, Login_Page_Objects.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Login_Page_Objects.username.sendKeys(Username);
		Login_Page_Objects.password.sendKeys(Password);
		Login_Page_Objects.login.click();
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	Object[][] data=null;
	WebElement element=driver.findElement(By.xpath(""));
	Object val=element;
	
	
	@DataProvider(name="testdata")
	public Object[][] passdata() throws BiffException, IOException{	
		data=getexceldata();
	return data;
		}
	
	public String[][] getexceldata() throws BiffException, IOException {
		
		FileInputStream file=new FileInputStream("E:\\DataDrivenTesting.xls");
		Workbook workbook=Workbook.getWorkbook(file);
		Sheet sheet=workbook.getSheet(0);
		int rowcount=sheet.getRows();
		int columncount=sheet.getColumns();
		String testData[][]=new String[rowcount-1][columncount];
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<columncount;j++) {
				System.out.print(sheet.getCell(j, i).getContents());
				System.out.print("\t");
				testData[i-1][j]=sheet.getCell(j, i).getContents();
				//testData[0][0]=sheet.getCell(0,1)
			
		}
		
	}
		return testData;
	}

}
