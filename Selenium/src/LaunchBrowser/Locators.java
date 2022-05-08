package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver drive=new ChromeDriver();
		WebElement ele=drive.findElement(By.id("a1"));
		ele.clear();
		Thread.sleep(9000);
		drive.findElement(By.className("c2").sendKeys("hey");
		
	}

}
