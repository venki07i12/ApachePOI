package practice;

import library.Exceldataconfig2;

public class ReadExceldata2 {

	public static void main(String[] args) throws Exception {
		
		Exceldataconfig2 ed= new Exceldataconfig2("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\Exceldata\\TestData.xlsx");
		System.out.println(ed.getdata(0, 0, 0));
		System.out.println(ed.getdata(0, 0, 1));
		

	}

}
