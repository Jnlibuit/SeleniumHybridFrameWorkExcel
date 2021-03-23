package com.abc.applications.i94.actions;

import org.openqa.selenium.WebDriver;

import com.abc.config.StartBrowser;
import com.abc.reuse.CommonFunctions;
import com.abc.wdcmds.ActionDriver;
import com.aventstack.extentreports.MediaEntityBuilder;


public class I94Actions {

	public WebDriver driver;
	public ActionDriver aDriver;

	public I94Actions()
	{
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}

	public void ApplyNow(String firstName,String lastName,String birth,String Gender,String documentNumber,String passportCountry,String passportIssue,String expirationDay,String expirationMonth,String expirationYear,String visaIssuanceCountry,String visaNumber,String visaIssueDay,String visaIssueMonth,String visaIssueYear) throws Exception
	{
		CommonFunctions cfs = new CommonFunctions();
		
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.lnkAppForNewI94, "Apply For New I-94 Link");
		aDriver.click(com.abc.applications.i94.or.I94.lnkApplyNow, "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.btnConsentContinue, "Consent & Continue");
		aDriver.click(com.abc.applications.i94.or.I94.rbtnviaalandborder, "via a land border");
		aDriver.type(com.abc.applications.i94.or.I94.txtFirstName, firstName, "First Name");
		aDriver.type(com.abc.applications.i94.or.I94.txtLastName, lastName, "Last Name");
		
		String[] ans = cfs.DateSplit(birth);
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthDay, ans[0], "Birth Day");
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthMo, ans[1], "Birth Month");
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthYear, ans[2], "Birth Year");
		
		CommonFunctions.Gender(Gender);
		
		//aDriver.click(com.abc.applications.i94.or.I94.rbtgendermale, "Gender Male");
		//aDriver.click(com.abc.applications.i94.or.I94.rbtgenderfemale, "Gender Female");
		//aDriver.click(com.abc.applications.i94.or.I94.rbtgenderother, "Gender other");
		
		aDriver.click(com.abc.applications.i94.or.I94.rbtpassport, "Passport");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportNumber, documentNumber, "Document Number");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportCountry, passportCountry, "Passport Country of Issue");
		
		String[] ans2 = cfs.DateSplit(passportIssue);
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportIssueDay, ans2[0], "Birth Day");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportIssueMonth, ans2[1], "Birth Month");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportIssueYear, ans2[2], "Birth Year");
		
		
		//aDriver.type(com.abc.applications.i94.or.I94.txtPassportIssueDay, issueDay, "Passport Issue Day");
		//aDriver.type(com.abc.applications.i94.or.I94.txtPassportIssueMonth, issueMonth, "Passport Issue Month");
		//aDriver.type(com.abc.applications.i94.or.I94.txtPassportIssueYear, issueYear, "Passport Issue Year");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportExpirationDay, expirationDay, "Passport Expiration Day");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportExpirationMonth, expirationMonth, "Passport Expiration Month");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportExpirationYear, expirationYear, "Passport Expiration Year");
		aDriver.type(com.abc.applications.i94.or.I94.txtVisaCountry, visaIssuanceCountry,"Visa Country of Issuance");
		aDriver.type(com.abc.applications.i94.or.I94.txtVisaNumber, visaNumber, "Visa Number");
		aDriver.type(com.abc.applications.i94.or.I94.txtVisaIssueDay, visaIssueDay, "Visa Issue Day");
		aDriver.type(com.abc.applications.i94.or.I94.txtVisaIssueMonth, visaIssueMonth, "Visa Issue Month");
		aDriver.type(com.abc.applications.i94.or.I94.txtVisaIssueYear, visaIssueYear, "Visa Issue Year");
		//aDriver.click(com.abc.applications.i94.or.I94.btnNext, "Next");
		
		
		
		cfs.screenPrint();
		
		//		//aDriver.type(com.abc.applications.i94.or.I94.txtBirthYear, issueYear, "Passport Issue Year");
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


		//Thread.sleep(2000);
	}

	public void ApplyNowNilo(String firstName,String lastName,String birth,String birthDay,String birthMonth,String birthYear,String Gender,String documentNumber,String passportCountry) throws Exception
	{
		CommonFunctions cfs = new CommonFunctions();
		
		
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.lnkAppForNewI94, "Apply For New I-94 Link");
		aDriver.click(com.abc.applications.i94.or.I94.lnkApplyNow, "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.btnConsentContinue, "Consent & Continue");
		aDriver.click(com.abc.applications.i94.or.I94.rbtnviaalandborder, "via a land border");
		aDriver.type(com.abc.applications.i94.or.I94.txtFirstName, firstName, "First Name");
		aDriver.type(com.abc.applications.i94.or.I94.txtLastName, lastName, "Last Name");
		
		String[] ans = cfs.DateSplit(birth);
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthDay, ans[0], "Birth Day");
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthMo, ans[1], "Birth Month");
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthYear, ans[2], "Birth Year");
		
		cfs.Gender(Gender);
		//System.out.println("+++++++++");
		//System.out.println(Gender);
		/*
		System.out.println("+++++++++");
		System.out.println(Gender);
		String gender = new String(Gender);
		String male = new String("M");
		System.out.println("aaaaaa");
		//System.out.println(a);
		if (male.equals(gender))
		{
			aDriver.click(com.abc.applications.i94.or.I94.rbtgendermale, "Gender Male");
			System.out.println("This is M");
		}else {
			System.out.println("This is not M");
		}
		if (Gender == "F")
		{
			aDriver.click(com.abc.applications.i94.or.I94.rbtgendermale, "Gender Male");
			System.out.println("This is F");
		}
		//aDriver.click(com.abc.applications.i94.or.I94.rbtgendermale, "Gender Male");
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


		//Thread.sleep(2000);
	}

	public void Gender(String gender) throws Exception
	{
		System.out.println("******");
		System.out.println(gender);
		if (gender=="M")
		{
			aDriver.click(com.abc.applications.i94.or.I94.rbtgendermale, "Gender Male");
			System.out.println("This is M");
		}
	}



	public void GroupUpload(String firstName,String lastName,String emailAddress) throws Exception
	{

		CommonFunctions cfs = new CommonFunctions();

		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Group Upload");
		aDriver.click(com.abc.applications.i94.or.I94.lnkAppForNewI94, "Apply For New I-94 Link");
		aDriver.click(com.abc.applications.i94.or.I94.lnkGroupUpload, "Group Upload");
		aDriver.click(com.abc.applications.i94.or.I94.btnConsentContinue, "Consent & Continue");
		aDriver.type(com.abc.applications.i94.or.I94.txtGroupFirstName, firstName, "First Name");
		aDriver.type(com.abc.applications.i94.or.I94.txtGroupLastName, lastName, "Last Name");
		aDriver.type(com.abc.applications.i94.or.I94.txtGroupEmailAddress, emailAddress, "Email Address");
		aDriver.type(com.abc.applications.i94.or.I94.txtGroupConfirmEmailAddress, emailAddress, "Confirm Email Address");
		aDriver.click(com.abc.applications.i94.or.I94.btnSubmit, "Submit");
		aDriver.click(com.abc.applications.i94.or.I94.btnCreateGroup, "YES, CREATE A GROUP");
		aDriver.click(com.abc.applications.i94.or.I94.btnChooseExcelFile, "CHOOSE EXCEL FILE");


		cfs.UploadFile("C:\\Users\\nlibu\\git\\SeleniumHybridFrameWorkExcel\\SeleniumHybridFrameWorkExcel\\TestData\\I94-File-Upload-Template_v0311.xlsx");

		cfs.screenPrint();
		//String screenshotPath = CommonFunctions.capture(driver, "screenshotForExtetReport");
		//StartBrowser.childTest.pass("Print Last Page",
		//		MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());

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
