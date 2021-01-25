package SIgnupPage;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static String address;
	static AppachePOI obj;

	public  Object[][] testdata() {
		address="Excel\\TestDat.xlsx";
		obj=new AppachePOI(address,"SIgnup");
		int rc=obj.getRowCount();
		int cc=obj.getcolumnCount();
		Object data[][]=new Object[rc-1][cc];
		for(int  i=1;i<rc;i++) {
			for(int j=0;j<cc;j++) {
				String Celldata=obj.getCellStringData(i, j);
				//System.out.print(Celldata + " |");
				data[i-1][j]=Celldata; 
				
			}
			System.out.println();
		}
		return data;
	}

}
