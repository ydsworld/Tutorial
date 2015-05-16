package com.ydsworld.ApachePOI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ApachePOIExcel {

	static Row row;
	   public static void main(String[] args) throws Exception 
	   {
	      
		  List<String> list = new ArrayList<String>();
		  FileInputStream fis = new FileInputStream(
	      new File("C:\\Users\\YDSWorld\\workspace\\Tutorial\\src\\Book1.xlsx"));
	      XSSFWorkbook workbook = new XSSFWorkbook(fis);
	      XSSFSheet spreadsheet = workbook.getSheetAt(0);
	      Iterator < Row > rowIterator = spreadsheet.iterator();
	      final StringBuilder b = new StringBuilder();
	      SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
	      
	      while (rowIterator.hasNext()) 
	      {
	    	  
	         row = (Row) rowIterator.next();
	         Cell cell =  row.getCell(0);
	        
	         b.append(cell.toString()+",");
	        // list.add(cell.toString());
	         
	         switch (cell.getCellType()) 
	            {
	               case Cell.CELL_TYPE_NUMERIC:
	            	   if (DateUtil.isCellDateFormatted(cell)) {
	            		   try {

	            			    list.add(sdf.format(cell.getDateCellValue()));
	            		//	    System.out.println(sdf.format(cell.getDateCellValue()));

	            			    } catch (Exception e) {
	            			            e.printStackTrace();
	            			    }
	                    } else {
	                //        System.out.println(cell.getNumericCellValue() + " \t\t " );
	                        
	                    }
	                    break;
	               case Cell.CELL_TYPE_STRING:
	            	   list.add(cell.getStringCellValue());
	              // System.out.print(cell.getStringCellValue() + " \t\t " );
	               
	            }
	         
	      }//white
	      fis.close();
	      
	      for(int i=0; i<list.size();i++){
	    	  System.out.println(list.get(i));
		  }
	      
	      //System.out.println(b.toString());
	   }
	   
	   
  
}
