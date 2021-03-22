package com.abc.reuse;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.abc.config.StartBrowser;
import com.abc.wdcmds.ActionDriver; 


public class CommonFunctions {

	public WebDriver driver;
	public ActionDriver aDriver;

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