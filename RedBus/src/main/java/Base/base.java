package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class base {
	public WebDriver driver;

	
	public void browserChrome(String path)
	{
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\srbhkul\\software\\sel\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get(path);
		
	
	}
	public void browserFirefox(String path)
	{
		FirefoxOptions options=new FirefoxOptions();
		
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.gecko.driver", "D:\\srbhkul\\software\\sel\\Firefox\\geckodriver.exe");
		driver = new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get(path);
		
	
	}
}

	
	
		
	
	

