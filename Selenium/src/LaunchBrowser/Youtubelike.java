package LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtubelike {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.youtube.co.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Feel the Power | Video Song (Kannada)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/watch?v=aPiZ--ASZI0\" and @id=\"video-title\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='top-level-buttons-computed']/ytd-toggle-button-renderer[1]")).click();
		Thread.sleep(2000);
	}

}
