package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
       
		File myFile=new File("C:\\Users\\ajink\\OneDrive\\Documents\\Book2.xlsx");
		
		String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(value1);
		
		String value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value2);
		
		String value3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(value3);
		
	    double value4 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
	    System.out.println(value4);
	  
	    String value5 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	    System.out.println(value5);
	  
	    double value6 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue();
	    System.out.println(value6);
	    
	    String value7 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
	    System.out.println(value7);
	  
	    String value8 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
	    System.out.println(value8);
	  
	    String value9 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(1).getCell(3).getStringCellValue();
	    System.out.println(value9);
	    
	    double value10 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(2).getCell(0).getNumericCellValue();
	    System.out.println(value10);
	    
	    String value11 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(2).getCell(1).getStringCellValue();
	    System.out.println(value11);
	    
	    String value12 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(2).getCell(2).getStringCellValue();
	    System.out.println(value12);
	    
	    String value13 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(2).getCell(3).getStringCellValue();
	    System.out.println(value13 );
	    
	    double value14 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(3).getCell(0).getNumericCellValue();
	    System.out.println(value14);
	    
	    String value15 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(3).getCell(1).getStringCellValue();
	    System.out.println(value15);
	    
	    String value16 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(3).getCell(2).getStringCellValue();
	    System.out.println(value16);
	    
	    String value17 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(3).getCell(3).getStringCellValue();
	    System.out.println(value17);
	    
	    boolean value18 = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(0).getCell(4).getBooleanCellValue();
	    System.out.println(value18);
	    
	    
	}

}
