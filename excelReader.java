package com.automation.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class excelReader {

	public excelReader() throws IOException{
		try {
			FileInputStream fileInput = new FileInputStream(new File("src/lib/testData.xslx"));
			XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			while(rowIterator.hasNext()){
				Row row = rowIterator.next();
				Iterator<org.apache.poi.ss.usermodel.Cell> cellIterator = row.cellIterator();
				while(cellIterator.hasNext()){
					org.apache.poi.ss.usermodel.Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						System.out.println(cell.getNumericCellValue() + "t");
						break;
					case Cell.CELL_TYPE_STRING:
						System.out.println(cell.getStringCellValue() + "t");
						break;
					}
					
				}
				System.out.println(" ");
			}
			fileInput.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
}
