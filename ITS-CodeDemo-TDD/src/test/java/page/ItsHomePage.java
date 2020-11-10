package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;
import utilities.reportRelated.Log4jManager;

public class ItsHomePage extends PageBase{

	/************************elements, data members***************************/
	
	private String itsUrl = "https://www.testsys.com/";
	
	@FindBy(xpath = "//a[@class = 'menu-link Directions']")
	@CacheLookup
	private WebElement directions;
	
	
	/**************************Constructor*******************************/
	public ItsHomePage() {
		logger.createNode("User goes to testsys.com");
		PageFactory.initElements(driver,this);
		driver.get(itsUrl);
		Log4jManager.info("User goes to testsys.com");
	}
	
	/**************************Methods*********************************/
	
	public ItsHomePage clickDirectionsBtn() {
		
		logger.createNode("User clicks on the Directions button");
		directions.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Log4jManager.info("User clicks on the Directions button");
		
		return this;
	}
}
