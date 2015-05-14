package com.ydsworld.ApachePOI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ApachePOIExcel {

	static XSSFRow row;
	   public static void main(String[] args) throws Exception 
	   {
	      FileInputStream fis = new FileInputStream(
	      new File("c:\\class\\chart.xlsx"));
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet = workbook.getSheetAt(0);
	      Iterator < Row > rowIterator = spreadsheet.iterator();
	      while (rowIterator.hasNext()) 
	      {
	         row = (XSSFRow) rowIterator.next();
	         Iterator < Cell > cellIterator = row.cellIterator();
	         while ( cellIterator.hasNext()) 
	         {
	            Cell cell = cellIterator.next();
	            switch (cell.getCellType()) 
	            {
	               case Cell.CELL_TYPE_NUMERIC:
	               System.out.print( 
	               cell.getNumericCellValue() + " \t\t " );
	               break;
	               case Cell.CELL_TYPE_STRING:
	               System.out.print(
	               cell.getStringCellValue() + " \t\t " );
	               break;
	            }
	         }
	         System.out.println();
	      }
	      fis.close();
	   }		
}
