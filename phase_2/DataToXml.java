package project_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataToXml {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();

		XSSFSheet sheetone = workbook.createSheet("mysheet");

		Object[][] data = { { "Malay1", "Ahmedabad" }, { "Ravi", "Delhi" } };

		int rows = data.length;
		int columns = data[0].length;

		for (int r = 0; r < rows; r++) {

			XSSFRow row = sheetone.createRow(r);

			for (int c = 0; c < columns; c++) {

				XSSFCell cell = row.createCell(c);

				Object cellValue = data[r][c]; // get cell value from data array

				cell.setCellValue((String) cellValue);
			}
		}

		// give the location where excel needs to be created

		String excelpath = "C:\\Users\\chozha\\Desktop\\mytestdata\\Employees_1.xlsx";

		File excelfile = new File(excelpath); // location of sheet

		FileOutputStream fos = new FileOutputStream(excelfile);

		workbook.write(fos);

		workbook.close();

		System.out.println("File writing task is completed into excel");

	}

}