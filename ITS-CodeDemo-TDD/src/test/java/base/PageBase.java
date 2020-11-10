package base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.elements.AlertHandler;
import utilities.elements.ElementUtil;
import utilities.reportRelated.Log4jManager;
import utilities.reportRelated.TestListener;

public abstract class PageBase extends TestListener  {
	
	
    public WebDriverWait wait;
	public ElementUtil eles;
	public AlertHandler alert;


	//constructor
	public PageBase() {
		eles = new ElementUtil(driver);  //initialize elements in constructor
		alert = new AlertHandler(driver);
		wait = new WebDriverWait(driver, 10);
	}
	
	/*----------------------
	Click Method
	public void click(By elementLocation) {
		waitVisibility(elementLocation);
		try {
			driver.findElement(elementLocation).click();
		}
		catch (Exception e) {
			Log4jManager.error("failed to click element");
		}
	}
	
	//WriteText Method
	public void writeText(By elementLocation, String text) {
		waitVisibility(elementLocation);
		driver.findElement(elementLocation).sendKeys(text);
	}
	
	**************************/

}
 