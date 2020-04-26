package readexceldata1;

import java.io.FileOutputStream;

import library.Exceldataconfig1;

public class ReadExceldata1 {

	public static void main(String[] args) throws Exception {
		
		Exceldataconfig1 excel = new Exceldataconfig1("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\Exceldata\\TestData.xlsx");
		System.out.println(excel.getdata(0, 1, 1));
		System.out.println(excel.getdata(0, 2, 1));
		FileOutputStream trg = new FileOutputStream("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\Exceldata\\output.xlsx");
		

		
	}

}
