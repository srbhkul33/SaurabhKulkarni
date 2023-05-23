package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//input[@id='src']") private WebElement from ;	
	
	@FindBy(xpath = "//input[@id='dest']") private WebElement to ;	
	
	@FindBy(xpath = "//ul[@class='autoFill homeSearch']/li") private List<WebElement> listF;
	
	@FindBy(xpath = "//ul[@class='autoFill homeSearch']/li") private List<WebElement> listT;
	
	@FindBy(xpath = "//td[@class='next']") private WebElement next ;	

	@FindBy(xpath = "//td[@class='monthTitle']") private WebElement monthTitle ;
	@FindBy(xpath = "(//td[@class='we day'])[2]") private WebElement day ;
	
	@FindBy(xpath = "//input[@id='onward_cal']") private WebElement calbutton ;
	@FindBy(xpath = "//button[@id='search_btn']") private WebElement searchBus ;
	
public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	
public void inputIntoFromField(String textF) {
	
	from.sendKeys(textF);
	
	for(int i=0;i<listF.size();i++) {
		WebElement city=listF.iterator().next();
		if(city.getText().equals("CIDCO, Aurangabad")) {
			city.click();
		}
		
	}
		
	}
	public void inputIntoToField(String textT) {
		
		to.sendKeys(textT);
		
		for(int i=0;i<listT.size();i++) {
			WebElement city=listT.iterator().next();
			if(city.getText().equals("Shivaji Nagar, Pune")) {
				city.click();
			}
	
}
	}
		public void dateSelect(String givenMonth) {
			
			calbutton.click();
		
			
		while(true) {	
		if(monthTitle.getText().equals(givenMonth)) {
			day.click();
			break;
		}else {
			next.click();
		}
		}
			
			
			
		}
	public void clickOnSearchButton() {
		searchBus.click();
	}
	

	
	}
