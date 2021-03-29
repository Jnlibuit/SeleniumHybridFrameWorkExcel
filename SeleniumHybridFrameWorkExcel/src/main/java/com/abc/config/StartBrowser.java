package com.abc.config;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.abc.reuse.CommonFunctions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
	public static WebDriver driver;
	//extent report variables
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	ExtentSparkReporter  extentSparkReporter ;
	String method;

	@BeforeClass
	public void beforeClass() {
		//WebDriverManager.chromiumdriver().setup();//

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@BeforeTest
	public void generateReport()
	{if(Objects.isNull(extent)){
		//ExtentSparkReporter spark = new ExtentSparkReporter("Reports/AutomationReport.html");
		ExtentSparkReporter spark = new ExtentSparkReporter("target/index.html");
		extent = new ExtentReports();
		extent.attachReporter(spark); 
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("TASS - PSPD Automation Report");
		spark.config().setReportName("PSPD Automation Test Suite");
	}
	}


	@BeforeMethod
	public void methodName(Method method){
		parentTest = extent.createTest(method.getName());
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
		//extent.flush();
	}
	@AfterTest

	public void  afterTest() throws IOException{
		if(Objects.nonNull(extent)){
			extent.flush();
			Desktop.getDesktop().browse(new File("target/index.html").toURI());	
		}
	}

}
