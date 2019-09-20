package domaci_09062019;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GlavniProgram {

	public static void main(String[] args) {
		double sum=0;
		try {
			File src = new File("Data.xls");
			FileInputStream fis;
			fis = new FileInputStream("Data.xls");
			HSSFWorkbook wb = new HSSFWorkbook(fis);
			HSSFSheet sheet = wb.getSheetAt(0);
			int rowcount = sheet.getLastRowNum();
			for (int i=0;i<rowcount+1;i++) {
			HSSFRow r = sheet.getRow(i);
			double data = r.getCell(0).getNumericCellValue();
			sum += data;
			System.out.println(sum);	
			}
			System.out.println("Suma elemenata u prvom redu je: "+sum);
			} catch (IOException e) {
			e.printStackTrace();
		}
			

	}

}
