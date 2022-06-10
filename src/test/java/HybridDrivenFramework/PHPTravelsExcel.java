package HybridDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PHPTravelsExcel {
	
	public static String Keywords(int rownum,int cellnum) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Sharayu\\workspace\\AutomationProject\\Excel\\phpTravelsHD.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println("Last Row---->"+sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String data1=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		}
		return null;
	}
	
	public static String Inputdata(int rowno,int cellno) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Sharayu\\workspace\\AutomationProject\\Excel\\phpTravelsHD.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println("Last Row---->"+sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String data2=sh.getRow(rowno).getCell(cellno).getStringCellValue();
		}
		return null;
	}

}
