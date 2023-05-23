package Base;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redBUS {
public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","D:\\srbhkul\\software\\sel\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.redbus.in/");
	
	WebElement fromField = driver.findElement(By.id("src"));
	WebElement toField = driver.findElement(By.id("dest"));
	
	fromField.sendKeys("pune");
	 List<WebElement> fromHomeSearch = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]/child::li"));
	
	for(WebElement w:fromHomeSearch) {
		
		String city = w.getText();
		if(city.equals("Shivaji Nagar, Pune")) {
			w.click();
		
		}
	}
	 List<WebElement> ToHomeSearch = driver.findElements(By.xpath("//ul[@class=\"autoFill homeSearch\"]/child::li"));
		
	for(WebElement w:ToHomeSearch) {
		
		String city = w.getText();
		if(city.equals("Thane West, Mumbai")) {
			w.click();
		
		}
	}
	WebElement cal = driver.findElement(By.id("onward_cal"));
   cal.click();
   
   String month="Nov 2022";
   String day ="7";
	
   
   WebElement next = driver.findElement(By.id("//tr[@class=\"rb-monthHeader\"]/td[@class=\"next\"]"));
  while(true) {
	   WebElement monthTitle = driver.findElement(By.id("//tr[@class=\"rb-monthHeader\"]/td[@class=\"monthTitle\"]"));

	  if(monthTitle.equals(month)) {
		 break;
	  }else {
		  
		  next.click();
	  }
  }
 int rowSize = driver.findElements(By.xpath("//tr[@class=\"rb-monthHeader\"]/following-sibling::tr")).size();

 int clmSize = driver.findElements(By.xpath("//tr[@class=\"rb-monthHeader\"]/following-sibling::tr/th")).size();

 
 
 for(int i=2;i<=rowSize;i++) {
	 for(int j=1;j<=clmSize;j++) {
		 WebElement date = driver.findElement(By.xpath("(//tr[@class=\"rb-monthHeader\"]/following-sibling::tr)["+i+"]/td["+j+"]"));
    if(date.getText().equals(day)) {
    	date.click();
    	break;
    }
	 }
 }
 
 
}
}
