package Extentlistner;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import java.util.Arrays;
import java.util.Date;
import org.testng.annotations.Test;
import java.io.IOException;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;



public class ExtentListner implements ITestListener{

    //ExtentTest test;
    // ExtentTest logger;

    static Date d = new Date();
    // protected static String fileName = "Extent_"+ d.toString().replace(":", "_").replace(":","_")+ ".html";
    protected static String fileName = "Testing.html";
    private static ExtentReports extent = ExtentManager.createInstance(System.getProperty("user.dir") + fileName);

    public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();

    ExtentTest test;


    @Override
    public void onTestStart(ITestResult result) {


        test = extent.createTest(result.getTestClass().getName() + "      @TestCase : " + result.getMethod().getMethodName());
        testReport.set(test);

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        String methodName = result.getMethod().getMethodName();

        String logText = "<b>" + "TEST CASE:-   " + methodName.toUpperCase() + "Passed" + "</b>";

        Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
        testReport.get().pass(m);

    }

    @Override
    public void onTestFailure(ITestResult result) {


        test.fail(result.getThrowable());
        extent.flush();

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        String methodName = result.getMethod().getMethodName();

        String logText = "<b>" + "TEST CASE:-   " + methodName.toUpperCase() + "Skipped" + "</b>";

        Markup m = MarkupHelper.createLabel(logText, ExtentColor.BROWN);
        testReport.get().skip(m);

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext result) {

    }

    @Override
    public void onFinish(ITestContext result) {


        if (extent != null) {


            extent.flush();

        }
    }
}