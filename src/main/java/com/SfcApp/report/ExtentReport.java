package com.SfcApp.report;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import com.SfcApp.utility.BaseClassMobile;
import com.SfcApp.report.TestUtils;


import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ExtentReport {
    static ExtentReports extent;
    public static String reportName = "";
    final static String filePath = "Extent.html";
    static Map<Integer, ExtentTest> extentTestMap = new HashMap();

    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
            TestUtils utils = new TestUtils();
            BaseClassMobile base = new BaseClassMobile();
            File reportsFolder = new File("reports");
            if (!reportsFolder.exists()) {
                reportsFolder.mkdirs();
            }
            reportName = "reports" + File.separator +
                    "adroid" +utils.dateTime() + ".html";
        	/*ExtentSparkReporter html = new ExtentSparkReporter("reports" + File.separator +
                    "web"+ base.getProps().getProperty("build") + "_" +
                    utils.dateTime()+".html");*/
        	
        	ExtentSparkReporter html = new ExtentSparkReporter(reportName).viewConfigurer().viewOrder().as(new ViewName[] {ViewName.DASHBOARD,ViewName.TEST,
            		ViewName.CATEGORY,ViewName.AUTHOR}).apply();
                   

        	html.config().setDocumentTitle("SFC Automation");
        	html.config().setReportName("SFC App");
        	html.config().setTheme(Theme.DARK);
            extent = new ExtentReports();
            extent.attachReporter(html);
           // extent.attachReporter(html2);
        }
        
        return extent;
    }
    
    public static synchronized ExtentTest getTest() {
        return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = getReporter().createTest(testName, desc);
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
        return test;
    }
}
