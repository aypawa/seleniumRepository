package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg8 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myFile=new File("C:\\Users\\ajink\\OneDrive\\Documents\\Book3.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		int totalNumOfRows = mySheet.getLastRowNum();
		int totalNoOfCell = mySheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalNumOfRows;i++)
		{
			for(int j=0;j<=totalNoOfCell;j++)
				
			{
				DataFormatter d=new DataFormatter();
				String va = d.formatCellValue(mySheet.getRow(i).getCell(j));
				System.out.println(va);
				//CellType cellDataType = mySheet.getRow(i).getCell(j).getCellType();
				
//				if(cellDataType==CellType.STRING)
//				{
//					String value = mySheet.getRow(i).getCell(j).getStringCellValue();
//					System.out.print(value+" ");
//				}

	}
		}}}

