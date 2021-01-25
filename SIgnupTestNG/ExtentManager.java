package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	private static ExtentReports extent;
	private static ExtentReporter report;
	//public ExtentTest extenttest;

	public static ExtentReports createinstance() {
		String filename= getReportname();  
		String dir=System.getProperty("user.dir")+"/Reports/";
		new File(dir).mkdirs();
		String path=filename+dir;
		ExtentSparkReporter htmlreporter = new ExtentSparkReporter(path);
		System.out.println(path);
		htmlreporter.config().setEncoding("utf-8");
		htmlreporter.config().setTheme(Theme.DARK);
		htmlreporter.config().setDocumentTitle("REPORT OF DOCUMENT");
		htmlreporter.config().setReportName("Extent report demo");
		report=new ExtentReports();
		report.setSystemInfo("Organization", "KualiTatem");
		report.setSystemInfo("Browser", "Chrome");
		report.attachReporter(htmlreporter);
		return report;
	}
	public static String getReportname() {
		Date d=new Date();
		String filename = "Automation Reports" + "_" + d.toString().replace(":", "_").replace(" ", " _") +".png";
		return filename;	
	}

}
