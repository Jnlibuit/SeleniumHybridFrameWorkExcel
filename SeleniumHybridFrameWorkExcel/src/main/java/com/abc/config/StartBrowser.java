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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
import com.aventstack.extentreports.*;
//import com.aventstack.extentreports.mediastorage.MediaStorage;
//import com.aventstack.extentreports.mediastorage.MediaStorageManagerFactory;
//import com.aventstack.extentreports.model.Author;
//import com.aventstack.extentreports.model.BasicReportElement;
import com.aventstack.extentreports.model.Category;
import com.aventstack.extentreports.model.ExceptionInfo;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.model.ScreenCapture;
//import com.aventstack.extentreports.model.Screencast;
//import com.aventstack.extentreports.model.SystemAttribute;
//import com.aventstack.extentreports.model.Test;
//import com.aventstack.extentreports.model.TestAttribute;
//import com.aventstack.extentreports.utils.MongoUtil;
import com.aventstack.extentreports.reporter.ExtentKlovReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
	public static WebDriver driver;
	//extent report variables
	public static ExtentReports extent;
	private static ExtentKlovReporter klov;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	ExtentSparkReporter  extentSparkReporter ;
	String method;

	@BeforeClass
	public void beforeClass() {
		//WebDriverManager.chromiumdriver().setup();//
		//WebDriverManager.firefoxdriver().setup();//
		WebDriverManager.edgedriver().setup();//
		
		//System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		//driver = new ChromeDriver();
		//driver = new chromeDriver();
		//driver = new FirefoxDriver();
		driver = new EdgeDriver();
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
		klov = new ExtentKlovReporter();
		klov.initMongoDbConnection("localhost",27017);
		klov.setProjectName("i94WebRegression");
		klov.setReportName("i94WebRegression"); 
		//extent.attachReporter(extentSparkReporter,klov);
	}
	}


	@BeforeMethod
	public void methodName(Method method){
		parentTest = extent.createTest(method.getName());
		
		System.out.println("parentTest");
			System.out.println(method.getName());
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
