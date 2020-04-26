package library;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Exceldataconfig2 {

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public Exceldataconfig2(String excelpath) throws Exception
	{
		File src = new File(excelpath);
		FileInputStream fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		
	}
	
	public String getdata(int sheetnumber, int row, int cell)
	{
		sheet1 = wb.getSheetAt(sheetnumber);
		String data = sheet1.getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	
}
