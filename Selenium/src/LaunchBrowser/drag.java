package LaunchBrowser;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drag {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Point p=new Point(300, 250);
		Thread.sleep(2000);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);

	}
}
