package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfig1 {
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public Exceldataconfig1(String excelpath)
	{
		try {
			File src = new File(excelpath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
	public String getdata(int sheetnumber, int row, int column)
	{
		sheet = wb.getSheetAt(sheetnumber);
		String data =sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

}
