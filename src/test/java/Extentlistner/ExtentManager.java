package Extentlistner;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    // public static String screenshotName;

    private static ExtentReports extent;

    public static ExtentReports createInstance(String fileName) {


        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);


        htmlReporter.config().setDocumentTitle("Store Status Automation Report");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName("Automation Test Report");
        htmlReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);


        return extent;
    }


}







