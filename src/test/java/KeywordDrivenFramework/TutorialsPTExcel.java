package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TutorialsPTExcel {
	
	public static String getExcel(int rownum,int cellnum) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Sharayu\\workspace\\AutomationProject\\Excel\\tutorialsPTKD.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println("Last Row---->"+sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String data=sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		}
		return null;
	}
}
