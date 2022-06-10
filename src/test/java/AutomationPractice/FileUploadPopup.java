package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadPopup {
	
	@Test
	public void fileUpload()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\sharprad\\Downloads\\customerReceipt.txt");
		
		driver.findElement(By.id("file-submit")).click();
		
		String expectedText="File Uploaded!";
		String actualText=driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText();
		Assert.assertEquals(actualText, expectedText);
		
		//Close the Browser
		driver.close();
		
	}

}
