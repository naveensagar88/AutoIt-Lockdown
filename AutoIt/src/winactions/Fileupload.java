package winactions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online2pdf.com/convert-pdf-to-jpg");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='browse_button']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\sagar\\fileupload.exe");

		//Runtime.getRuntime().exec("C:\\Users\\sagar\\Downloads\\Documents\\fileupload.exe");
		//driver.quit();
	
	}

}
