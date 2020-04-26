package reasdexceldata;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import library.Exceldataconfig;

public class ReadExceldata3 {

	public static void main(String[] args) throws Exception {
		
		Exceldataconfig excel = new Exceldataconfig("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\Exceldata\\TestData1.xlsx");
		System.out.println(excel.getdata(0, 0, 0));
		System.out.println(excel.getdata(0, 0, 1));
		System.out.println(excel.getdata(1, 0, 0));
		
		// here you can specify where you want to save file
		FileOutputStream fout=new FileOutputStream(new File("D:\\Selenium Testing\\filename2.xlsx"));

	}

}
