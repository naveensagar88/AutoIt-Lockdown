package winactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopOutuserpwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");

		WebDriver driver = new ChromeDriver();

		
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
	//driver.get("https://admin:admin@//the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Basic Auth")).click();

	}

}