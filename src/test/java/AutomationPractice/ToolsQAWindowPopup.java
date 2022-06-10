package AutomationPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolsQAWindowPopup {

	@Test
	public void executeWindowPopup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//Click on New Tab Button
		driver.findElement(By.id("tabButton")).click();
		
		Set<String>allWindows=driver.getWindowHandles();
		System.out.println("ID's of All windows--->"+allWindows);
		System.out.println("Size of All windows--->"+allWindows.size());
		
		String parent=driver.getWindowHandle();
		System.out.println("ID of parent window--->"+parent);
		
		Iterator<String>it=allWindows.iterator();
		while(it.hasNext())
		{
			String child=it.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				String childAactUrl=driver.getCurrentUrl();
				String childExpUrl="https://demoqa.com/sample";
				Assert.assertEquals(childAactUrl, childExpUrl);
				
			}
		}
		
		driver.switchTo().window(parent);
		String parentActUrl=driver.getCurrentUrl();
		String parentExpUrl="https://demoqa.com/browser-windows";
		Assert.assertEquals(parentActUrl, parentExpUrl);
		
		driver.quit();
		
		
	}

	}
