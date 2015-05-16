package com.ydsworld.ApachePOI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
import org.hamcrest.core.SubstringMatcher;


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
	      final StringBuilder sb = new StringBuilder();
	      SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	      Date currentDate = new Date();
	      
	      while (rowIterator.hasNext()) 
	      {
	    	  
	         row = (Row) rowIterator.next();
	         Cell cell =  row.getCell(0);
	        
	         switch (cell.getCellType()) 
	            {
	               case Cell.CELL_TYPE_NUMERIC:
	            	   if (DateUtil.isCellDateFormatted(cell)) {
	            		   try {
                                if(sb.length()>0) {
                                	sb.deleteCharAt(sb.length()-1); 
                                	sb.append("-"); 
                                }
	            			    sb.append(sdf.format(cell.getDateCellValue()) + ":");

	            			    } catch (Exception e) {
	            			            e.printStackTrace();
	            			    }
	                    } else {
	                //        System.out.println(cell.getNumericCellValue() + " \t\t " );
	                        
	                    }
	                    break;
	               case Cell.CELL_TYPE_STRING:
	            	  sb.append(cell.getStringCellValue() + ",");
	               
	            }
	         
	      }//while
	      fis.close();

	      list = new ArrayList(Arrays.asList(sb.toString().split("-")));
	      
	     
	      //for(String item:list){
	      for(int i=0; i<list.size();i++){
	    	  	Date temp = sdf.parse(list.get(i).substring(0,10));
	    	  
	    	  if (currentDate.after(temp)){
	    		  list.remove(i);
	    	  }
	    	 
	    	  System.out.println(list.get(i));
	      }
	      

	   }
	   
	   
  
}
