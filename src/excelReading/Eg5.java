package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile=new File("C:\\Users\\ajink\\OneDrive\\Documents\\Book2.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet7");
		System.out.println("=======================");
		
		for(int i=0;i<=6;i++)
		{
		     for(int j=0;j<=2;j++)
		     {
		    	 String value = mySheet.getRow(i).getCell(j).getStringCellValue();
		    	 System.out.print(value+" ");
		     }
		     System.out.println();
		}
	}

}
