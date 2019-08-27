package com.app.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basepage {

	
	public static WebDriver driver;
	public String browser = "chrome";

	public basepage() {
		
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DELL\\Desktop\\selenium\\chromedriver.exe");
				driver = new ChromeDriver();
				
				driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			
		}
		public String getTitlte() {
			return driver.getTitle();
	}	
		
		public void setText(WebElement element, String name) {
				element.click();
				element.sendKeys(name);
			}

	
}
