package CTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rekha\\eclipse-workspace\\SeleniumTask2\\Driver\\chromedriver.exe");
	WebDriver driver = new  ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
		
	WebElement lnk=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
    lnk.click();
	
	WebElement btn= driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box']"));
	btn.click();
	
	 org.openqa.selenium.Alert txt = driver.switchTo().alert();
	driver.switchTo().alert().sendKeys("Rekha");
	String s =driver.switchTo().alert().getText();
	System.out.println(s);
	driver.switchTo().alert().accept();
		 
}
}