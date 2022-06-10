package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertExample {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Click on Click for JS Alert
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
		
		//Switch to Alert
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert Text--->"+alert.getText());
		Thread.sleep(1000);
		
		//Click on OK button 
		alert.accept();
		
		//Close the Browser
		driver.close();
		
	}

}
