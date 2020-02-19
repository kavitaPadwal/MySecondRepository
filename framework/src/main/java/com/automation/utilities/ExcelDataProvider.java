package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	

	public ExcelDataProvider() {
		File src = new File("./TestData/Testdata.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		}  catch (Exception e) {
			System.out.println("unable to load excelfile"+e.getMessage());
		}

	}
		
	public String getStringData(String SheetName,int row, int column) {
		return wb.getSheet(SheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(int SheetIndex,int row, int column) {
		return wb.getSheetAt(SheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
    public double getNumericData(String SheetName,int row, int column) {
    	return wb.getSheet(SheetName).getRow(row).getCell(column).getNumericCellValue();
	}
    public int getRowCount(int sheetIndex) {
    	int row= wb.getSheetAt(sheetIndex).getLastRowNum();
    	row=row+1;
    	return row;
    }

}



/*static Workbook wb;
static Sheet sheet;

public static void getTestData(String sheetName) {
	FileInputStream file=null;
	try {
		file  = new FileInputStream("./TestData/Testdata.xlsx");
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	
	try {
		wb=WorkbookFactory.create(file);
	}catch(InvalidFormatException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();	
	}
	sheet=wb.getSheet(sheetName);
	Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	
	for(int i=0;i<sheet.getLastRowNum();i++) {
		for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
			data[i][k]=sheet.getRow(i+1).getCell(k).toString();
		}
	}
	
}*/

