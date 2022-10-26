package CTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Rekha\\eclipse-workspace\\Client\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();	
	driver.get("https://demo.guru99.com/test/guru99home/");
	driver.manage().window().maximize();
	//to remove frame by name,id
	driver.switchTo().frame("a077aa5e");
		
	WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
	img.click();
	
	driver.switchTo().defaultContent();
	WebElement email = driver.findElement(By.id("philadelphia-field-email"));
	email.sendKeys("rekhasanjay@gmail.com");
	
	}
}