package reasdexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExceldata {

	public static void main(String[] args) throws Exception {
	
		File src = new File("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\Exceldata\\TestData1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		//HSSFWorkbook wb = new HSSFWorkbook();  // for XLS files
		XSSFSheet sheet1= wb.getSheetAt(0);
		String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is:" +data1);
		
		String data2 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is:" +data2);
		
		wb.close();
	}

}
