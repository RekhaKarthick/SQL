package CTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) {
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Rekha\\eclipse-workspace\\SeleniumTask2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		
		
		
	}

}
