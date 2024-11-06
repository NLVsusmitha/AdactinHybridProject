package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.BaseTest;

public class ExtentManager extends BaseTest {
	
	public static ExtentReports getReports()
	{
		//ExtentReports reports=new ExtentReports();
		String reportsFolderPath=System.getProperty("user.dir")+"\\reports";
		if(reports==null)
		{
			reports=new ExtentReports();
			String pattern = "yyyy-MM-dd HH:mm:ss";
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

			String date = simpleDateFormat.format(new Date());
			
			date=date.replace(':', '-');
			File reportsFile=new File(reportsFolderPath+"\\"+date+".html"); // creating html file in reports folder
			ExtentSparkReporter reporter=new ExtentSparkReporter(reportsFile);
			reporter.config().setDocumentTitle("AdactinQA Regression Results");
			reporter.config().setReportName("regression reports");
			reports.attachReporter(reporter);
			
		}
		return reports;
		
	}

}
