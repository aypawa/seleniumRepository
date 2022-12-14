package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		File myFile=new File("C:\\Users\\ajink\\OneDrive\\Documents\\Book3.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		System.out.println("===========================");
		
		//to read single row
		for(int i=0;i<=3;i++)
		{
			String value = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
		System.out.println("==========================");
		
		for(int i=0;i<=7;i++)
		{
			String value = mySheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value+" ");
		}
		System.out.println("=============================");
		
		
	}

}
