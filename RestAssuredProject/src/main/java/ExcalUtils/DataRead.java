package ExcalUtils;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataRead {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	public DataRead(String path , String sheetname) {
		try {
			wb = new XSSFWorkbook(path);
			sheet=wb.getSheet(sheetname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void Rowcount() {

		int rowcount=sheet.getLastRowNum();
		System.out.println(rowcount);


	}

	public static Object[][] getdata(){
		
		DataFormatter format=new  DataFormatter();
		int rc=sheet.getLastRowNum();
		int cc=sheet.getRow(0).getPhysicalNumberOfCells();
		Object data[][]=new Object[rc-1][cc];
		for(int i=1;i<rc;i++) {
			for(int j=0;j<cc;j++) {
				Object value=format.formatCellValue(sheet.getRow(i).getCell(j));
				System.out.print(value);
				data[i-1][j]=value; 
		}	
			System.out.println();
		}
		return data;
	}
	public static String[][] getdata1(){
		DataFormatter format=new  DataFormatter();
		int rc=sheet.getLastRowNum();
		int cc=sheet.getRow(0).getPhysicalNumberOfCells();
		String data[][]=new String[rc-1][cc];
		for(int i=1;i<rc;i++) {
			for(int j=0;j<cc;j++) {
				String value=sheet.getRow(i).getCell(j).toString();
				//System.out.print(value);
				data[i-1][j]=value; 
				//System.out.print(data[i-1][j]);
				
		}	
			System.out.println();
		}
		return data;
	}
	public static void readdata() {
		int rc=sheet.getLastRowNum();
		int cc=sheet.getRow(0).getPhysicalNumberOfCells();
		String data[][]=getdata1();
		for(int i=1;i<rc;i++) {
			for(int j=0;j<cc;j++) {
				System.out.print(data[i-1][j] +"|");
	}}}
	}
