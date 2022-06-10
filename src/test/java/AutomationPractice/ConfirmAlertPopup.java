package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfirmAlertPopup {
	
	@Test
	public void confirmPopup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Click on Click for JS Confirm
		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		
		//Switch to Alert
		Alert alert=driver.switchTo().alert();
		System.out.println("Confirm Alert Text--->"+alert.getText());
		Thread.sleep(1000);
		
		//Click on OK button 
		alert.accept();
		
		String OKText=driver.findElement(By.xpath("//*[@id='result']")).getText();
		System.out.println("After clicking on OK button text displayed is--->"+OKText);
		
		Thread.sleep(1000);
		
		//Click on Click for JS Confirm
		driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
		
		//Switch to Alert
		alert=driver.switchTo().alert();
		System.out.println("Confirm Alert Text--->"+alert.getText());
		Thread.sleep(1000);
		
		//Click on Cancel button 
		alert.dismiss();
		
		String CancelText=driver.findElement(By.xpath("//*[@id='result']")).getText();
		System.out.println("After clicking on Cancel button text displayed is--->"+CancelText);
		
		//Close the Browser
		driver.close();
				
	}

}
