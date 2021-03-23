package com.abc.reuse;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.abc.config.StartBrowser;
import com.abc.wdcmds.ActionDriver;
import com.aventstack.extentreports.MediaEntityBuilder; 


public class CommonFunctions {

	public static WebDriver driver;
	public static ActionDriver aDriver;
	public static Properties prop;
	public CommonFunctions()
	{
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}

	public void Signin(String userName, String password) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Signin to Amazon");

		//aDriver.navigateToApplication("https://www.amazon.com/");
		aDriver.mouseHover(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");
		//aDriver.click(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Link");
		aDriver.click(com.abc.applications.sample.objectrepository.AccountPage.btnSignin, "Sigin in button");	
		aDriver.type(com.abc.applications.sample.objectrepository.SigninPage.txtEmaild, userName, "Email Id");
		//aDriver.type(com.abc.applications.sample.objectrepository.SigninPage.txtEmaild, password, "Password");
		aDriver.click(com.abc.applications.sample.objectrepository.SigninPage.btnContinue, "Continue button");
		aDriver.type(com.abc.applications.sample.objectrepository.SigninPage.txtPassword, password, "Password");
		aDriver.click(com.abc.applications.sample.objectrepository.SigninPage.btnSignIn, "Sign-In button");
		Thread.sleep(2000);
	}

	public void AccountMenu() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "However to Account Menu");
		aDriver.mouseHover(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");




		//Thread.sleep(1000);
	}
	public static String[] DateSplit(String date) throws Exception
	{
		String date1 = date;
		String day = "";
		String mo = "";
		String year = "";
		String[] x=date.split("-");
		//System.out.println(day+x[0]);
		//System.out.println(day+x[1]);
		//System.out.println(day+x[2]);

		day =(x[0]);
		mo = (x[1]);
		year =(x[2]);

		String[] ans = new String[3]; 
		ans[0]  =day; 
		ans[1] = mo;
		ans[2] = year;

		//System.out.println("6666666");
		//System.out.println(ans[0]);
		//System.out.println(ans[1]);
		//System.out.println(ans[2]);
		
		return ans;
		//Thread.sleep(1000);
	}
	public void Signout() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "However to Account Menu");

		aDriver.mouseHover(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");
		aDriver.click(com.abc.applications.sample.objectrepository.AccountPage.lnkSignout, "Signout Link");



		//Thread.sleep(1000);
	}

	public void NavigateToHomePage(String url ) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Navigate to Home Page");
		aDriver.navigateToApplication(url);

		//aDriver.mouseHover(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");



		//Thread.sleep(1000);
	}

	public static void Gender(String gender ) throws Exception
	{
		String gendera = new String(gender);

		String male = new String("M");
		String female = new String("F");
		String other = new String("O");

		if (gendera.equals(male))
		{
			aDriver.click(com.abc.applications.i94.or.I94.rbtgendermale, "Gender Male");


		}
		if (gendera.equals(female))
		{
			aDriver.click(com.abc.applications.i94.or.I94.rbtgenderfemale, "Gender Female");

		}

		if (gendera.equals(other))
		{
			aDriver.click(com.abc.applications.i94.or.I94.rbtgenderother, "Gender Other");

		}

		//public static By rbtgenderfemale = By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/span[1]/div[8]/div[1]/div[4]/div[2]/div[1]/div[2]/label[1]/span[1]");

		//public static By rbtgenderother = By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/span[1]/div[8]/div[1]/div[4]/div[2]/div[1]/div[3]/label[1]/span[1]");
	}
	public static String capture(WebDriver driver, String screenshotName) throws IOException 
	{
		//StartBrowser.childTest = StartBrowser.parentTest.createNode( "Navigate to Home Page");
		TakesScreenshot ts=(TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest=System.getProperty("user.dir")+"/ErrorScreenshot/"+screenshotName+".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);

		return dest;
	}

	public void screenPrint() throws IOException 
	{
		String screenshotPath = CommonFunctions.capture(driver, "screenshotForExtetReport");
		StartBrowser.childTest.pass("Print Last Page",
				MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	}
	
	public static String processInput() throws IOException 
	{
		//System.out.println("Here inside processInput");
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/test/java/com/abc/applications/i94"
					+ "/I94config/config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String urlLink = prop.getProperty("url");
		//System.out.println("Url link");
		//System.out.println(urlLink);
		
		return urlLink;
	}
	public void UploadFile(String filename ) throws Exception
	{
		//StartBrowser.childTest = StartBrowser.parentTest.createNode( "Upload File");

		Thread.sleep(500);
		//Use robot=new Robot class to upload file
		Robot robot = new Robot();
		//Store the path of the file to be uploaded using StringSelection class object


		StringSelection filepath = new StringSelection (filename);


		//System.out.println(filename);

		//Copy above path tom clipboard

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);

		//Now press CTRL
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(500);

		//Press V
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(500);

		//Release V
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(500);

		//Release CTRL
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(500);

		//Release V
		robot.keyPress(KeyEvent.VK_CANCEL);
		Thread.sleep(500);

		//Release CTRL
		robot.keyRelease(KeyEvent.VK_CANCEL);
		Thread.sleep(500);




		//Thread.sleep(1000);
	}
}