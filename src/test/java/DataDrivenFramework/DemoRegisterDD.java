package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class DemoRegisterDD {
	
	@Test
	public void registerDD() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		FileInputStream fis=new FileInputStream("C:\\Sharayu\\workspace\\AutomationProject\\Excel\\demoRegister.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println("Last Row Num----->"+sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			XSSFRow row=sh.getRow(i);
			
			String firstName=row.getCell(0).getStringCellValue();
			String lastName=row.getCell(1).getStringCellValue();
			String addr=row.getCell(2).getStringCellValue();
			String email=row.getCell(3).getStringCellValue();
			String phone=row.getCell(4).toString();
			String lang=row.getCell(5).getStringCellValue();
			String skills=row.getCell(6).getStringCellValue();
			String selCountry=row.getCell(7).getStringCellValue();
			String year=row.getCell(8).toString();
			String month=row.getCell(9).getStringCellValue();
			String day=row.getCell(10).toString();
			String pass=row.getCell(11).getStringCellValue();
			String conPass=row.getCell(12).getStringCellValue();
			
			//Fill Details
			driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys(firstName);
			driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys(lastName);
			driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(addr);
			driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys(email);
			driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys(phone);
			driver.findElement(By.xpath("//*[@ng-model='radiovalue']")).click();
			driver.findElement(By.id("checkbox1")).click();
			
			driver.findElement(By.id("msdd")).click();
			
			List<WebElement>list=driver.findElements(By.xpath("//ul[contains(@class,'')]//li//a"));
			System.out.println("Size of List---->"+list.size());
			for(WebElement ele:list)
			{
				String text=ele.getText();
				System.out.println("Text of Languages---->"+text);
				
				if(text.equals(lang))
				{
					ele.click();
					break;
				}
			}
			Thread.sleep(1000);
			
			//Scroll Down the Page
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,300)");			
			
			Select skillsdrp=new Select(driver.findElement(By.id("Skills")));
			skillsdrp.selectByVisibleText(skills);
			
			Select country=new Select(driver.findElement(By.id("countries")));
			country.selectByIndex(0);
			
			WebElement con=driver.findElement(By.xpath("//input[@role='textbox']"));
			con.click();
			con.sendKeys(selCountry);
			con.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			
			Select yeardrp=new Select(driver.findElement(By.id("yearbox")));
			yeardrp.selectByVisibleText(year);
			Select monthdrp=new Select(driver.findElement(By.xpath("//*[@ng-model='monthbox']")));
			monthdrp.selectByVisibleText(month);
			Select daydrp=new Select(driver.findElement(By.id("daybox")));
			daydrp.selectByVisibleText(day);
			
			driver.findElement(By.xpath("//*[@ng-model='Password']")).sendKeys(pass);
			driver.findElement(By.xpath("//*[@ng-model='CPassword']")).sendKeys(conPass);
			driver.findElement(By.id("submitbtn")).click();
			
			
			
		}
		
	}

}
