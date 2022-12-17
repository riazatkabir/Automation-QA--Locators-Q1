package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorQ1 extends BaswDriverQ1 {
	@Test (priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(itera);
		driver.manage().window().maximize();
	}
	@Test (priority = 1)
	public void testLocators() throws InterruptedException{
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("test1@yahoo.com");
		Thread.sleep(2000);
		
		WebElement mobileNumber = driver.findElement(By.id("phone"));
		name.sendKeys("01678710333");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("email"));
		name.sendKeys("abc@xyz.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("password"));
		name.sendKeys("fhfgfhgu");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.id("address"));
		name.sendKeys("Dhaka,Bangladesh");
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}
	
	@Test (priority = 2)
	public void login() throws InterruptedException {
		WebElement loginText = driver.findElement(By.name("submit')]"));
		loginText.click();
		Thread.sleep(5000);
	}
		}
		
	


