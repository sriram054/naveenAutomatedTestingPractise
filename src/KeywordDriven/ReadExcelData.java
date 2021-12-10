package KeywordDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	private static XSSFWorkbook wb;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	public static void setExcelFile(String path,String SheetName) throws Exception
	{
		File f=new File(path);
		FileInputStream fis=new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet(SheetName);
	}
	public static String getCellData(int rowno,int colno) throws Exception
	{
		cell=sheet.getRow(rowno).getCell(colno);
		String celldata=cell.getStringCellValue();
		return celldata;
		
	}

}
