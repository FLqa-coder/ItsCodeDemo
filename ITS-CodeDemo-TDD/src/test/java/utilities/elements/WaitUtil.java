package utilities.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.reportRelated.Log4jManager;

public class WaitUtil {
	
	private WebDriver driver;
	
	public WaitUtil (WebDriver driver) {
		this.driver= driver;
	}

	
	public void wait(int i) {
		try {
			Thread.sleep(i * 1000);
			Log4jManager.info("Waited" + i + "second(s)");
		}catch (InterruptedException e) {
			Log4jManager.error("Error caught in Thread.sleep");
			e.printStackTrace();
		}
		

	}
	
	
	
	public void waitElemPresent(By by) {
		try {
			WebDriverWait wait = new WebDriverWait (driver, 30);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		catch (Exception e) {
			Log4jManager.error("Error caught locator: " + by.toString());
			e.printStackTrace();
		}
	}
	
	
	
	
	public void waitElemClickable(By by) {
				
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(by));
		}
		catch (Exception e) {
			Log4jManager.error("Error caught locator: " + by.toString());
			e.printStackTrace();
		}
	}
	
	
	public void waitElemVisible(By by) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		catch (Exception e) {
			Log4jManager.error("Error caught locator: " + by.toString());
			e.printStackTrace();
		}
	
	
	}	
	
}
