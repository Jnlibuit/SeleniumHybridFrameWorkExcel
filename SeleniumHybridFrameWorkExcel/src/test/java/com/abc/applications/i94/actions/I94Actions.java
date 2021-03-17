package com.abc.applications.i94.actions;

import org.openqa.selenium.WebDriver;

import com.abc.config.StartBrowser;
import com.abc.wdcmds.ActionDriver;

public class I94Actions {
	
	public WebDriver driver;
	public ActionDriver aDriver;
	
	public I94Actions()
	{
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}

	public void ApplyNow() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.lnkAppForNewI94, "Apply For New I-94 Link");
		aDriver.click(com.abc.applications.i94.or.I94.lnkApplyNow, "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.btnConsentContinue, "Consent & Continue");
		aDriver.click(com.abc.applications.i94.or.I94.rbtnviaalandborder, "via a land border");
		aDriver.type(com.abc.applications.i94.or.I94.txtFirstName, "xxxxxxx", "First Name");
		
		/*
		//aDriver.navigateToApplication("https://www.amazon.com/");
		aDriver.mouseHover(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Menu");
		//aDriver.click(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Link");
		aDriver.click(com.abc.applications.sample.objectrepository.AccountPage.btnSignin, "Sigin in button");	
		aDriver.type(com.abc.applications.sample.objectrepository.SigninPage.txtEmaild, userName, "Email Id");
		//aDriver.type(com.abc.applications.sample.objectrepository.SigninPage.txtEmaild, password, "Password");
		aDriver.click(com.abc.applications.sample.objectrepository.SigninPage.btnContinue, "Continue button");
		aDriver.type(com.abc.applications.sample.objectrepository.SigninPage.txtPassword, password, "Password");
		aDriver.click(com.abc.applications.sample.objectrepository.SigninPage.btnSignIn, "Sign-In button");
		*/
		
		
		Thread.sleep(2000);
	}
	
}
