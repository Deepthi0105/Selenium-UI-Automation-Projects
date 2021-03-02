package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataOperations {
	
	public static String readExcel(int row, int col, String file) throws IOException {

		FileInputStream fs = new FileInputStream(".//resources//Data.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet ws = wb.getSheet(file);
		XSSFCell cell = ws.getRow(row).getCell(col);
		cell.setCellType(CellType.STRING);
		String data = cell.toString();
		System.out.println("data-->" + data);
		return data;
	}

}
