package readexceldata1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class ReadExceldata {

	public static void main(String[] args) throws Exception {
		
		File src = new File("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\Exceldata\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		//String str = sheet1.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(str);
		int rowcount = sheet1.getLastRowNum();
		System.out.println(rowcount);
		for(int i=0;i<rowcount;i++)
		{
			String str = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(str);
			
		}
		
		
		
		wb.close();
		

	}

}
