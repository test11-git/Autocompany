package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jarsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://www.leafground.com/pages/drop.html";
        

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
        WebElement from =driver.findElement(By.id("draggable"));
        WebElement to =driver.findElement(By.id("droppable"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(from, to).build().perform();
        System.out.println("drag and drop done");
        driver.close();
        
	}

}