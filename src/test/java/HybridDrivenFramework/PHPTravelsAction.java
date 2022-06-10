package HybridDrivenFramework;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PHPTravelsAction {
	
	public static WebDriver driver;
	
	public static void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Dri\\chromedriver.exe");
		driver.get("https://phptravels.org/register.php");
		
	}
	
	public static void navigate()
	{
		driver.get("https://phptravels.org/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public static void firstname() throws IOException
	{
		String fn=PHPTravelsExcel.Inputdata(3,0);
		driver.findElement(By.id("inputFirstName")).sendKeys(fn);
	}
	
	public static void lastname() throws IOException
	{
		String ln=PHPTravelsExcel.Inputdata(4,0);
		driver.findElement(By.id("inputLastName")).sendKeys(ln);
	}
	
	public static void email() throws IOException
	{
		String em=PHPTravelsExcel.Inputdata(5,0);
		driver.findElement(By.id("inputEmail")).sendKeys(em);
	}
	
	public static void phonedrp() throws IOException
	{
		
		String phdrp=PHPTravelsExcel.Inputdata(6,0);
		driver.findElement(By.xpath("//div[@class='flag-container']")).click();
		List<WebElement>list=driver.findElements(By.xpath("//ul[@class='country-list']/li/span[1]"));
		System.out.println("List of Countries---->"+list.size());
		for(int i=0;i<=list.size();i++)
		{
			WebElement ele=list.get(i);
			String text=ele.getText();
			if(text.equalsIgnoreCase(phdrp))
			{
				ele.click();
				break;
			}
		}
		
	}
	
	public static void phone() throws IOException
	{
		String ph=PHPTravelsExcel.Inputdata(7,0);
		driver.findElement(By.id("inputPhone")).sendKeys(ph);
	}
	
	public static void street() throws IOException
	{
		String str=PHPTravelsExcel.Inputdata(8,0);
		driver.findElement(By.id("inputAddress1")).sendKeys(str);
	}
	
	public static void city() throws IOException
	{
		String cty=PHPTravelsExcel.Inputdata(9,0);
		driver.findElement(By.id("inputCity")).sendKeys(cty);
	}
	
	public static void state() throws IOException
	{
		String st=PHPTravelsExcel.Inputdata(10,0);
		driver.findElement(By.id("stateinput")).sendKeys(st);
	}
	
	public static void postalcode() throws IOException
	{
		String pc=PHPTravelsExcel.Inputdata(11,0);
		driver.findElement(By.id("inputPostcode")).sendKeys(pc);
		
		//Scroll down the webpage
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,300)");
	}
	
	public static void mobile() throws IOException
	{
		String mb=PHPTravelsExcel.Inputdata(12,0);
		driver.findElement(By.id("customfield2")).sendKeys(mb);
	}
	
	public static void clickongeneratepwd() throws IOException
	{
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-default btn-sm btn-xs-block')]")).click();
	}
	
	public static void pwdlength() throws IOException
	{
		String pwdlen=PHPTravelsExcel.Inputdata(14,0);
		driver.findElement(By.id("inputGeneratePasswordLength")).sendKeys(pwdlen);
	}
	
	public static void copy() throws IOException
	{
		driver.findElement(By.id("btnGeneratePasswordInsert")).click();
	}
	
	public static void clickonrobot() throws IOException
	{
		//Switch to Frame
		WebElement fr=driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
		driver.switchTo().frame(fr);
		driver.findElement(By.id("recaptcha-anchor")).click();
	}
	
	public static void clickonregister() throws IOException
	{
		driver.findElement(By.xpath("input[@value='Register']")).click();
	}
	

}
