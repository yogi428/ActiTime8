package pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exclDDF {

	public static void main(String[] args) throws IOException {
		
			FileInputStream fis=new FileInputStream("E:\\ActiTime8\\Actitm\\testdata\\apache.xlsx");
			
			try (XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
				XSSFSheet sheet=workbook.getSheet("Sheet1");
				
				int totalrows=sheet.getLastRowNum();
				
				int totalcells=sheet.getRow(1).getLastCellNum();
				
				System.out.println("total nmbers of rows : " + totalrows);
				
				System.out.println("total number of cells :" + totalcells);
				
				//System.out.println();;
			}
			
//			System.
//			
//			for() {
//				for() {
//					
//				}
//			}
//			
//			int totalrows=sheet.getLastRowNum();
//			int totalcells=sheet.getRow(1).getLastCellNum();
//			
//			System.out.println("number of rews:"+ totalrows);
//			System.out.println("number of cell:"+ totalcells);
//			
			  
					
					


	}

}
