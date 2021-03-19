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

	public void ApplyNow(String firstName,String lastName,String birthDay,String birthMonth,String birthYear,String documentNumber,String passportCountry) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.lnkAppForNewI94, "Apply For New I-94 Link");
		aDriver.click(com.abc.applications.i94.or.I94.lnkApplyNow, "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.btnConsentContinue, "Consent & Continue");
		aDriver.click(com.abc.applications.i94.or.I94.rbtnviaalandborder, "via a land border");
		aDriver.type(com.abc.applications.i94.or.I94.txtFirstName, firstName, "First Name");
		aDriver.type(com.abc.applications.i94.or.I94.txtLastName, lastName, "Last Name");
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthDay, birthDay, "Birth Day");
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthMo, birthMonth, "Birth Month");
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthYear, birthYear, "Birth Year");
		aDriver.click(com.abc.applications.i94.or.I94.rbtgendermale, "Gender Male");
		//aDriver.click(com.abc.applications.i94.or.I94.rbtgenderfemale, "Gender Female");
		//aDriver.click(com.abc.applications.i94.or.I94.rbtgenderother, "Gender other");
		aDriver.click(com.abc.applications.i94.or.I94.rbtpassport, "Passport");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportNumber, documentNumber, "Document Number");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportCountry, passportCountry, "Passport Country of Issue");
		//aDriver.click(com.abc.applications.i94.or.I94.rbtbcc, "BCC");
		
		
		
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
	
	public void GroupUpload(String firstName,String lastName,String emailAddress) throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.lnkAppForNewI94, "Apply For New I-94 Link");
		aDriver.click(com.abc.applications.i94.or.I94.lnkGroupUpload, "Group Upload");
		aDriver.click(com.abc.applications.i94.or.I94.btnConsentContinue, "Consent & Continue");
		aDriver.type(com.abc.applications.i94.or.I94.txtGroupFirstName, firstName, "First Name");
		aDriver.type(com.abc.applications.i94.or.I94.txtGroupLastName, lastName, "Last Name");
		aDriver.type(com.abc.applications.i94.or.I94.txtGroupEmailAddress, emailAddress, "Email Address");
		aDriver.type(com.abc.applications.i94.or.I94.txtGroupConfirmEmailAddress, emailAddress, "Confirm Email Address");
		//aDriver.click(com.abc.applications.i94.or.I94.rbtnviaalandborder, "via a land border");
		//aDriver.type(com.abc.applications.i94.or.I94.txtFirstName, firstName, "First Name");
		//aDriver.type(com.abc.applications.i94.or.I94.txtLastName, lastName, "Last Name");
		//aDriver.type(com.abc.applications.i94.or.I94.txtBirthDay, birthDay, "Birth Day");
		
		
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
