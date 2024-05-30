import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("\"C:\\Vision02\\Vision02\\Narcissious_Test cases -4_9_22.xlsx\"");
		XSSFWorkbook book= new XSSFWorkbook(fis);
		XSSFSheet sheet= book.getSheet("Aster+Peony22A");
		XSSFRow row= sheet.getRow(2);
		XSSFCell cell= row.getCell(2);
		String s= cell.getStringCellValue();
		System.out.println(s);
	}

}
