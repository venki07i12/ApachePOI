package practice;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexceldata1 {

	public static void main(String[] args) throws Exception {
		
		File src = new File("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\Exceldata\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		System.out.println(rowcount);
		for(int i=0; i<rowcount; i++)
		{
			String data = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}
		
		
		
		wb.close();
	}

}
