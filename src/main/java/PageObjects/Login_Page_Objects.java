package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_Page_Objects {
	
	//test
	@FindBy(how=How.ID,using="txtUsername")	
	public static WebElement username;
	
	@FindBy(how=How.ID,using="txtPassword")	
	public static WebElement password;
	
	@FindBy(how=How.ID,using="btnLogin")	
	public static WebElement login;
	
	@FindBy(how=How.ID,using="menu_admin_viewAdminModule")	
	public static WebElement Admin;
	
	@FindBy(how=How.ID,using="searchSystemUser_userType")	
	public static WebElement dropdown1;
	
	@FindBy(how=How.ID,using="searchBtn")	
	public static WebElement search;
	
		
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[2]/a")
	public static WebElement row1;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[1]/td[3]/preceding::td[1]")
	public static WebElement row2;
	
	@FindBy(xpath="/html/body/table/tbody")
	public static WebElement mytable;
	
	@FindBy(xpath="/html/body/table/tbody/tr")
	public static List<WebElement> mytable_rows;
	

}
