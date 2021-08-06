package TestCases;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import CommonFunctions.commonfunctions;
import PageObjects.Login_Page_Objects;

public class Test_User_Role extends commonfunctions {	
	ExtentTest testcase;
	
	Reusablemethods x = new Reusablemethods();
	
	@FindBy(how=How.ID,using="menu_admin_viewAdminModule")	
	public static WebElement Admin;
	
	//@Test
	public void TC1() throws InterruptedException {
		
		System.out.println("inside the method tc1");
		testcase=extentreport.createTest("Verify Login");
		testcase.log(Status.INFO, "Navigating to the application");
		PageFactory.initElements(driver, Login_Page_Objects.class);
		Login_Page_Objects.username.sendKeys(properties.getProperty("username"));
		Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
		Login_Page_Objects.login.click();
		testcase.log(Status.PASS, "Logged into the application");
		Thread.sleep(3000);		
	}
	
	//@Test
	public void TC2() throws InterruptedException {
		
		System.out.println("inside the method tc2");
		testcase=extentreport.createTest("Verify title");
		testcase.log(Status.INFO, "Navigating to the application");
		PageFactory.initElements(driver, Login_Page_Objects.class);
		String title=driver.getTitle();
		if(title.equals("OrangeHRM")) {
		testcase.log(Status.PASS, "Actual title and expected title are equal");
		}else {
			testcase.log(Status.PASS, "Actual title and expected title are not equal");
		}
		Thread.sleep(3000);		
	}
	//@Test
	public void TC3() throws InterruptedException {
		
		System.out.println("inside the method tc3");
		testcase=extentreport.createTest("Verify dropdown");
		testcase.log(Status.INFO, "Navigating to the application");
		PageFactory.initElements(driver, Login_Page_Objects.class);
		String title=driver.getTitle();
		if(title.equals("OrangeHRM")) {
		testcase.log(Status.PASS, "Actual title and expected title are equal");
		}else {
			testcase.log(Status.PASS, "Actual title and expected title are not equal");
		}
		Thread.sleep(3000);		
		Login_Page_Objects.username.sendKeys(properties.getProperty("username"));
		Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
		Login_Page_Objects.login.click();
		testcase.log(Status.PASS, "Logged into the application");
		Thread.sleep(3000);		
		//Login_Page_Objects.Admin.click();	
		x.click(Admin);
		Select select =new Select(driver.findElement(By.id("searchSystemUser_userType")));
		select.selectByValue("0");
		Login_Page_Objects.search.click();
		Thread.sleep(3000);	
		 WebElement baseTable = driver.findElement(By.tagName("table"));		
		  List<WebElement> columns=driver.findElements(By.tagName("th")); 
		  int columncount=columns.size(); 
		  System.out.println("no of columns:"+columncount);
		  List<WebElement> rows=driver.findElements(By.tagName("tr")); 
		  int rowcount=rows.size(); 
		  System.out.println("no of rows:"+rowcount);
		//Loop will execute till the last row of table.
	    	for (int row = 0; row < rowcount; row++) {
	    		//To locate columns(cells) of that specific row.
	    	    List < WebElement > Columns_row = rows.get(row).findElements(By.tagName("td"));
	    	    System.out.println("Number of cells In Row " + row + " are " + columncount);
	    	//Loop will execute till the last cell of that specific row.
    	   for (int column = 0; column < columncount; column++) {
    	    	String celltext=columns.get(column).getText();    	    					
				System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celltext);
    	    }  
	    	}
			/*
			 * WebElement firstrow =
			 * driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[1]")); String
			 * rowtext = firstrow.getText();
			 * System.out.println("first row of table : "+rowtext);
			 */
		/*
		 * List<WebElement> roles = driver.findElements(By.xpath("//td[3]"));
		 * WebElement[] myArray = new WebElement[roles.size()]; for(WebElement x:
		 * myArray) { System.out.println(x); } roles.toArray(myArray); for(WebElement
		 * x:roles) { System.out.println(x); }
		 */
		//Login_Page_Objects.row1.click();		
		Thread.sleep(5000);
	}
	//@Test
	public void TC4() throws InterruptedException {
		
		System.out.println("inside the method tc3");
		testcase=extentreport.createTest("Verify dropdown");
		testcase.log(Status.INFO, "Navigating to the application");
		PageFactory.initElements(driver, Login_Page_Objects.class);
		String title=driver.getTitle();
		if(title.equals("OrangeHRM")) {
		testcase.log(Status.PASS, "Actual title and expected title are equal");
		}else {
			testcase.log(Status.PASS, "Actual title and expected title are not equal");
		}
		Thread.sleep(3000);		
		Login_Page_Objects.username.sendKeys(properties.getProperty("username"));
		Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
		Login_Page_Objects.login.click();
		testcase.log(Status.PASS, "Logged into the application");
		Thread.sleep(3000);		
		Login_Page_Objects.Admin.click();		
		Select select =new Select(driver.findElement(By.id("searchSystemUser_userType")));
		select.selectByValue("0");
		Login_Page_Objects.search.click();
		Thread.sleep(3000);	
		 WebElement baseTable = driver.findElement(By.tagName("table"));		
		  List<WebElement> columns=driver.findElements(By.tagName("th")); 
		  int columncount=columns.size(); 
		  System.out.println("no of columns:"+columncount);
		  List<WebElement> rows=driver.findElements(By.tagName("tr")); 
		  int rowcount=rows.size(); 
		  System.out.println("no of rows:"+rowcount);	
		//Loop will execute till the last row of table.
	    	for (int row = 1; row < rowcount; row++) {
	    		//To locate columns(cells) of that specific row.
	    	    List < WebElement > Columns_row = rows.get(row).findElements(By.tagName("td"));	    	   
	    	    System.out.println("Number of cells In Row " + row + " are " + columncount);
	    	  //Loop will execute till the last cell of that specific row.
	     	   for (int column = 1; column < columncount; column++) {
	     	    	String celltext=columns.get(column).getText();    	    					
	 				System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celltext);
	 				if(celltext.contains("ESS")) {
	 					Login_Page_Objects.row2.click();		
	     	    }  
	 	    	}
	    	}
		Thread.sleep(5000);
	}
}


