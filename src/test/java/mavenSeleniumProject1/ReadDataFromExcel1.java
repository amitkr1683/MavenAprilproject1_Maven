package mavenSeleniumProject1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel1 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("./testData/RegistrationData.xlsx");// this is excel 2019 file thats we are using XSSF if below then we will use HSSF
		
		//workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		//XSSFSheet sheet = workbook.getSheet("smokeTest");
		XSSFSheet sheet = workbook.getSheet("Student");
		
		int rowCount = sheet.getLastRowNum();
		int columnCount =sheet.getRow(0).getLastCellNum();
		
		System.out.println("no. of Rows: " + rowCount);
		System.out.println("no. of Columns: " + columnCount);
		
		for(int i = 1; i <= rowCount; i++) {
			
			XSSFRow currentRow = sheet.getRow(i);
			
			String firstName = currentRow.getCell(0).toString();
			String lastName = currentRow.getCell(1).toString();
			String email = currentRow.getCell(2).toString();
			String mobile = currentRow.getCell(3).toString();
			String address = currentRow.getCell(4).toString();
			
			System.out.println("*******************");
			System.out.println("FirstName: " + firstName);
			System.out.println("Lastname: " + lastName);
			System.out.println("email: " + email);
			System.out.println("mobile: " + mobile);
			System.out.println("Address details: " + address);
						
		}
	}
}