package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TutorialsPTAction {
	
	public static WebDriver driver;
	
	public static void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Dri\\chromedriver.exe");
	    driver=new ChromeDriver();
	}
	
	public static void navigate()
	{
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public static void enterfirstname()
	{
		driver.findElement(By.name("firstname")).sendKeys("Ankur");
	}
	
	public static void enterlastname()
	{
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
	}
	
	public static void selectgender()
	{
		driver.findElement(By.name("sex")).click();
	}
	
	public static void selectexp()
	{
		driver.findElement(By.name("exp")).click();
	}
	
	public static void enterdate()
	{
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[5]/td[2]/input")).sendKeys("12/03/2020");
	}
	
	public static void selectprofession()
	{
		driver.findElement(By.name("profession")).click();
	}
	
	public static void selectprofile()
	{
		driver.findElement(By.name("photo")).sendKeys("C:\\Sharayu\\workspace\\AutomationProject\\Excel\\tutorialsPTKD.xlsx");
	}
	
	public static void selectflavour()
	{
		driver.findElement(By.name("tool")).click();
	}
	
	public static void selectcontinent()
	{
		Select condrp=new Select(driver.findElement(By.name("continents")));
		condrp.selectByVisibleText("Asia");
	}
	
	public static void selectcommands()
	{
		Select commandsdrp=new Select(driver.findElement(By.name("selenium_commands")));
		commandsdrp.selectByVisibleText("Navigation Commands");
	}
	
	public static void clickonsubmit()
	{
		driver.findElement(By.name("submit")).click();
	}
	
}

