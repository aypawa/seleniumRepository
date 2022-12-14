package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		File myFile=new File("C:\\Users\\ajink\\OneDrive\\Documents\\Book2.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet11");
		
		int lastRowNum = mySheet.getLastRowNum();
		
		System.out.println("last row no. is "+lastRowNum);
		
		int TotalNoOfRows = lastRowNum;
		System.out.println("Total no of rows are "+TotalNoOfRows);
		
		short lastCellNo = mySheet.getRow(0).getLastCellNum();
		System.out.println("last cell no is "+lastCellNo);
		
         int totalNoOfCell = lastCellNo-1;
         System.out.println("total no of cell "+totalNoOfCell);
         
         for(int i=0;i<=TotalNoOfRows;i++) {
        
        	 for(int j=0;j<=totalNoOfCell;j++)
        	 {
        		 String value = mySheet.getRow(i).getCell(j).getStringCellValue();
        		 System.out.print(value+" ");
        	 }
        	 System.out.println();
         }
         
	}

}
