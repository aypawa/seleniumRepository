

        package excelReading;

        import java.io.File;
		import java.io.IOException;

		import org.apache.poi.EncryptedDocumentException;
		import org.apache.poi.ss.usermodel.WorkbookFactory;
        import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

  public class Eg1 {

			public static void main(String[] args) throws EncryptedDocumentException, IOException 
			{
				
				File myFile= new File("C:\\Users\\ajink\\OneDrive\\Documents\\ajinkya1.xlsx");
				
				String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
				
				System.out.println(value1);
				
				
				String value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
				System.out.println(value2);
				
				
				String value3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
				System.out.println(value3);
				
				double value4 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
				System.out.println(value4);
				
				double value5 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
				System.out.println(value5);
				
				boolean value6 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(3).getBooleanCellValue();
			    System.out.println(value6);
			}
		
		
	}


