package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {


	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://135.250.162.71/services/webapp/debug/resources.php");

		driver.switchTo().alert().sendKeys("wdt"+Keys.TAB+"UFd8OUkqnD93TEQGds0x6LG845JHsemhH7TDl_AmcFqxLkFl3V6XHhSgjRtyBf0FHB1BCft2AgxGKvxZpvh+APMXdvEsVtco0_HcZ7fSNAp1PGadkeuYcsAUJqMY2mIgPjx19UE0GB+ZjeflchuhG5TZXG6+79Zt5AiYHxHW51+6WZkU");

		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		//WebElement alerts = driver.findElement(By.xpath("(//td[@class='c4'])[4]"));
		  WebElement alerts = driver.findElement(By.xpath("(//strong)[4]"));
		  String text = alerts.getText();
		  if (text.contains("reset")){
			System.out.println("warm reset is gone");

			/*driver.findElement(By.linkText("VoIP")).click();
	         driver.findElement(By.linkText("VoIP Information")).click();

			 */
			System.out.println(alerts.getText());

			driver.get("https://135.250.162.71/services/webapp/debug/voip_dump.php");
			
			driver.findElement(By.linkText("VoIP Debug")).click();
			driver.findElement(By.linkText("Use voipdebug command")).click();
			driver.findElement(By.id("champText")).sendKeys("getflg");
			driver.findElement(By.xpath("//input[@class='btn']")).click();
			
			driver.findElement(By.id("champText")).clear();
			driver.findElement(By.id("champText")).sendKeys("setflg sipphone 0xffffffff");
			driver.findElement(By.xpath("//input[@class='btn']")).click();
			driver.findElement(By.id("champText")).clear();
			driver.findElement(By.id("champText")).sendKeys("setflg sipgw 0xffffffff");
			driver.findElement(By.xpath("//input[@class='btn']")).click();
			driver.findElement(By.id("champText")).clear();
			driver.findElement(By.id("champText")).sendKeys("send sipphone s SIP trace 0xffffffff");
			driver.findElement(By.xpath("//input[@class='btn']")).click();
			driver.findElement(By.id("champText")).clear();
			driver.findElement(By.id("champText")).sendKeys("send sipgw s SIP trace  0xffffffff");
			driver.findElement(By.xpath("//input[@class='btn']")).click();
			
			WebDriver frameContent = driver.switchTo().frame("DebugVoipContent");
			
			
		
			
			
		}


		Set<String> windowHandles = driver.getWindowHandles();

		List<String> windowList= new ArrayList<String>();
		windowList.addAll(windowHandles);
        

	}

}
