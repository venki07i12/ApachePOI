package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexceldata {

	public static void main(String[] args) throws Exception {
		
		File src = new File("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\Exceldata\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		String data2 = sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data2);
		
		wb.close();
	}

}
