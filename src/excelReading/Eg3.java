package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File myFile=new File("C:\\Users\\ajink\\OneDrive\\Documents\\Book2.xlsx");
	
		Workbook myWorkbook = WorkbookFactory.create(myFile);
		
		Sheet mySheet = myWorkbook.getSheet("Sheet2");
		
		Row myRow = mySheet.getRow(2);
		
		Cell myCell = myRow.getCell(0);
		
		CellType dataType = myCell.getCellType();
		
		System.out.println("data type is "+dataType);
		
		System.out.println(myCell.getNumericCellValue());
		
		
		System.out.println("==========================");
		
		
		Workbook myWorkbook1 = WorkbookFactory.create(myFile);
		
		Sheet mySheet1 = myWorkbook1.getSheet("Sheet2");
		
		Row myRow1 = mySheet1.getRow(2);
		
		Cell myCell1 = myRow1.getCell(1);
		
		CellType dataType1 = myCell1.getCellType();
		
		System.out.println("data type is "+dataType1);
	
		System.out.println(myCell1.getStringCellValue());
		
		
		System.out.println("==========================");
		
		
		Workbook myWorkbook2 = WorkbookFactory.create(myFile);
		
		Sheet mySheet2 = myWorkbook.getSheet("Sheet2");
		
		Row myRow2 = mySheet2.getRow(0);
		
		Cell myCell2 = myRow2.getCell(4);
		
		 CellType dataType2 = myCell2.getCellType();
		
		System.out.println("data type is "+dataType2);
		
		System.out.println(myCell2.getBooleanCellValue());
		
		System.out.println("============================");
		
		
		
		
		
		
		
	}

}
