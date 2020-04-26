package reasdexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldata2 {

	public static void main(String[] args) throws Exception {
	
		File src = new File("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\Exceldata\\TestData1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//HSSFWorkbook wb = new HSSFWorkbook();  // for XLS files
		XSSFSheet sheet1= wb.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total rows:" +rowcount);
		for(int i=0; i<rowcount; i++)
		{
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from Excel sheet is" +data);
		}
		
	}

}
