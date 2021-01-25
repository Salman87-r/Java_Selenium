package ExcalUtils;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path="./Excel/Rest.xlsx";
		String sheetname="Sheet1";
		DataRead dt=new DataRead(path,sheetname);
			dt.readdata();

//		for(int i=1;i<data.length;i++) {
//			for(int j=0;j<data.length;j++) {
//				
//				System.out.print(data[i][j]);
//				
//		}}
		//dt.getdata1();
	}

}
