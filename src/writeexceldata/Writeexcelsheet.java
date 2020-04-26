package writeexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeexcelsheet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File src = new File("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\Exceldata\\TestData1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1= wb.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		sheet1.getRow(2).createCell(2).setCellValue("need clarification");
		FileOutputStream trg = new FileOutputStream(src);
		wb.write(trg);
		wb.close();
	}

}
