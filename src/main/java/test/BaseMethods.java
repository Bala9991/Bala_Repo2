package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseMethods {

	public static  RemoteWebDriver driver;
	
	static boolean isAlertDisplayed() {
		
		boolean myAlert=false;
		
		try {
			
			Alert alert = driver.switchTo().alert();
			myAlert=true;
			return myAlert;
			
		}
		
		catch(NoAlertPresentException e){
			System.out.println("No alert is present");
		}
		
		return myAlert;
		
		
	}
	
}
