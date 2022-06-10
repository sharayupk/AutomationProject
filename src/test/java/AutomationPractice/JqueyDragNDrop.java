package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JqueyDragNDrop {
	
	@Test
	public void dragNDrop()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\\\Dri\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Switch to Frame
		driver.switchTo().frame(0);
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		String beforeColor=target.getCssValue("background-color");
		System.out.println("Before Dragging Element Color Of Target Element----->"+beforeColor);
		
		//Perform Mouse Actions
		Actions action=new Actions(driver);
		//action.dragAndDrop(src, target).build().perform();
		action.clickAndHold(src).moveToElement(target).release().build().perform();
		
		String afterColor=src.getCssValue("background-color");
		System.out.println("After Dragging Element Color Of Target Element----->"+afterColor);
		
		//Close the Browser
		driver.close();
	}

}
