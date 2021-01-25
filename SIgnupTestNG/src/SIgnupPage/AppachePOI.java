package SIgnupPage;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AppachePOI {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	Object data[][];
	public AppachePOI(String address,String sheetname) {
		try {
		wb=new XSSFWorkbook(address);
		sheet=wb.getSheet("SIgnup");
	}catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		System.out.println(e.getCause());
		e.printStackTrace();
}	
		}
	public static int getRowCount() {
			int rowCount=sheet.getPhysicalNumberOfRows();
			return rowCount;
}
	public static int getcolumnCount() {
		int colCount=sheet.getRow(0).getPhysicalNumberOfCells();
		return colCount;
}
	public String getCellStringData(int rownum,int colnum) {

			String Celldata=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			return Celldata;
	}
	public static int getCellNumericData(int rownum,int colnum) {
			int Celldata=(int) sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			return Celldata;
	}
}
