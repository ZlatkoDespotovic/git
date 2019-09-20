package domaci_09062019;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExellUtility {
	private static HSSFWorkbook wb = null;
	private static HSSFSheet sheet = null;
	private static HSSFRow row = null;
	private static String excellPath;

	public static boolean setExcell(String path) {
		if (wb!=null){
			try {
				wb.close();
			}catch(Exception e) {
				System.out.println(e.toString());
				return false;
			}
		}
		File f = new File(path);
		try {
			FileInputStream fis = new FileInputStream(f);
			wb = new HSSFWorkbook(fis);
			excellPath=path;
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Lose otvaranje fajla");
			return false;
		}
	}
	
	public static boolean setWorkSheet(int index) {
		try {
			sheet = wb.getSheetAt(index);
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Lose otvaranje worksheet-a");
			return false;
		}
	}
	
	public static String getDataAt(int row, int column) {
		try {
			String s;
			HSSFRow r= sheet.getRow(row);
			HSSFCell celija=r.getCell(column);
			return s=celija.toString();
			
		}catch(NullPointerException e) {
			System.out.println(e.toString());
			System.out.println("Nesto je NULL");
		
		}catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("Doslo je do greske");
			
		}
		return "";
	}
	
	public static int getRowNumber() {
		try {
			return sheet.getLastRowNum()+1;
		}catch(Exception e) {
			System.out.println(e.toString());
			System.out.println("Doslo je do greske");
			return -1;
		}
	}
	
}

