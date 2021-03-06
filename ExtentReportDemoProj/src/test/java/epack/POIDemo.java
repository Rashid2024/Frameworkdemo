package epack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIDemo {

	public POIDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\P10242232\\Desktop\\ExcelTestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheetCount = workbook.getNumberOfSheets();
		for (int i=0;i<sheetCount;i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("SheetA")) {
				
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> firstrowCell = firstrow.iterator();
				while (firstrowCell.hasNext()) {
					
					System.out.println(firstrowCell.next().getStringCellValue());
				}
				
				
			}
			
		}
		
		System.out.println("Number of sheets in the spreadsheet is: "+ sheetCount);

	}

}
