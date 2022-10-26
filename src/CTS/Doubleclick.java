package CTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rekha\\eclipse-workspace\\Client\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement element = driver.findElement(By.id("email"));
	element.sendKeys("welcome");
	Actions actions = new Actions(driver);
	actions.doubleClick(element).perform();
	
	
	
	
	
}
}
