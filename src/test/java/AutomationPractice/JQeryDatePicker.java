package AutomationPractice;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JQeryDatePicker {
	
    public static WebDriver driver;
    static String day="2";
    static String month="May 2023";
    
	@Test
	public void fileUpload()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Dri\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(ele);

		driver.findElement(By.id("datepicker")).click();
		
		//previousDate();
		//futureDate();
		currentDate();
		
	}
	
	public static void currentDate()
	{
		Calendar cal=Calendar.getInstance();
		int date=cal.get(Calendar.DATE);
		String d=String.valueOf(date);
		driver.findElement(By.linkText(d)).click();
	}
	
	public static void previousDate()
	{
		while(true)
		{
			String mon=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
			System.out.println(mon);
			
			if(mon.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		driver.findElement(By.linkText(day)).click();
	}
	
	public static void futureDate()
	{
		while(true)
		{
			String mon=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
			System.out.println(mon);
			
			if(mon.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			}
		}
		driver.findElement(By.linkText(day)).click();
	}
		
	
}
