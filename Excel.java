package Test;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel {
	
	public static void main(String args[]) throws BiffException, IOException {
		String FilePath = "C:/Users/Jaliza/Desktop/Selenium/Test Files/Read Value Test.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		int totalNoOfRows = sh.getRows();
		int totalNoOfCols = sh.getColumns();
		for (int row = 0; row < totalNoOfRows; row++) {
			for (int col = 0; col < totalNoOfCols; col++) {
				System.out.print(sh.getCell(col, row).getContents() + "\t");
			}
			System.out.println();
			Excel read = new Excel();
			read.readExcel();
		}
	}
	 private void readExcel() {
		// TODO Auto-generated method stub
		
	}
}

