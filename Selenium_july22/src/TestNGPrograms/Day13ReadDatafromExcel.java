package TestNGPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Day13ReadDatafromExcel {
	@Test
	public static void ReadExcel() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Shree\\Desktop\\Employee.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("EMP");
		
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());
		
	}

}
