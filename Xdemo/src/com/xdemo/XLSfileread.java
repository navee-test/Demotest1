package com.xdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class XLSfileread {

	public static String path = "C:\\Users\\anude\\eclipse-workspace\\Xdemo\\testdata\\demotest.xls";
	
	public static void main(String[] args) throws IOException {
		
		String val = getData(path, "test", "invaliddata", "password");
		System.out.println(val);		
	}
	
	
	public static String getData(String filename, String sheetname, String rowwname, String columname) throws IOException {
		File f = new File(filename);
		FileInputStream fin = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(fin);
		HSSFSheet sheet = wb.getSheet(sheetname);
		HSSFRow row = sheet.getRow(0);
		String req1 = "";
		int colnum=0;
		for(int i = 0; i<row.getLastCellNum(); i++) {
			HSSFCell cell = row.getCell(i);
			//System.out.println(cell);
			if(cell.toString().equalsIgnoreCase(columname)) {
				//int index = i;
				colnum = cell.getColumnIndex();
				
			}	
		}
		
		for(int j = 1; j<sheet.getLastRowNum()+1; j++) {
			HSSFRow row1 = sheet.getRow(j);
		HSSFCell cell = row1.getCell(0);
			HSSFCell req = row1.getCell(colnum);
			
			//System.out.println(cell);
			if(cell.getStringCellValue().equalsIgnoreCase(rowwname)) {
				//int index = i;
				req1 = req.getStringCellValue();
				
			}	
		}	
			return req1;
		
	}
	
	
	

}
