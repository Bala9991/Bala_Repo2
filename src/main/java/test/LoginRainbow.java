package test;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.IStabilityClassifier;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class LoginRainbow extends BaseMethods {

	
	@Test
	public void login() throws InterruptedException {
	

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe");
		RemoteWebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://web.openrainbow.com/app/1.40.6/index.html");
		
		Thread.sleep(25000);
		
		driver.findElementById("username").sendKeys("balachandar.pn@al-enterprise.com");;
		driver.findElementById("authPwd").sendKeys("Welcome1$");
		
		Thread.sleep(3000);
		
         //driver.findElementById("buttonDuq0hQUbZY").click();
		driver.findElementByXPath("//span[text()='CONNECT']").click();
		
		Thread.sleep(25000);
		driver.findElementByXPath("//span[text()='LATER']").click();
		
		Thread.sleep(3000);
		
		try{   
			   driver.switchTo().alert().dismiss();  
			  }catch(Exception e){ 
			   System.out.println("unexpected alert not present");   
			  }
	
		
		  driver.findElementByXPath("//span[text()='CLOSE']").click();
		  
		  driver.findElementByXPath("//div[text()='OK']").click();
		  
		  
		  driver.findElementById("avatar").click();
		  driver.findElementByXPath("//div[text()='My profile']").click();
		  Thread.sleep(5000);
		  
		  driver.findElementByXPath("//div[text()='Edit']").click(); 
		  Thread.sleep(6000);
		 
		  WebElement eleUpload = driver.findElement(By.id("uploadArea"));
		  WebDriverWait wait = new WebDriverWait(driver,10);
		  wait.until(ExpectedConditions.elementToBeClickable(eleUpload));
		  eleUpload.sendKeys("./image_rainbow/Rainbow_status.png");
		  
		 /* driver.setFileDetector(new LocalFileDetector());

		  WebElement eleUpload = driver.findElementById("uploadArea");

		    eleUpload.sendKeys("C:/Users/bpn/Desktop/Rainbow_status.png");*/
		    
		    
		    		
		   // driver.findElement(By.id("uploadArea")).sendKeys("./image_rainbow/Rainbow_status.png");
		    
		    
		//WebDriverWait wait=new WebDriverWait(driver,5);
	
		//wait.until(ExpectedConditions.elementToBeClickable(close));
		 
		
		
         /*driver.switchTo().alert().accept();
         driver.switchTo().alert().dismiss();
		*/
		

	}

}
