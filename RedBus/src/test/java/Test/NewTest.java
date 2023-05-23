package Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.base;
import POM.HomePage;

public class NewTest extends base {
 
	 HomePage home;
	
	@BeforeClass
  public void launch() {
	  browserChrome("https://www.redbus.in/");
	 home =new HomePage(driver);
	  
  }
	
	@Test
	public void test() throws InterruptedException{
		
	home.inputIntoFromField("Aurangabad");
	Thread.sleep(500);
	home.inputIntoToField("Pune");
	Thread.sleep(500);
	home.dateSelect("Oct 2022");
	Thread.sleep(5000);
	home.clickOnSearchButton();
	}
	
}
