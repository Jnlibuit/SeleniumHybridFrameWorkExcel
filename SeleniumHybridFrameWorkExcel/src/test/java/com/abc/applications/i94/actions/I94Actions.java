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

	public void ApplyNow(String firstName,String lastName,String birth,String Gender,String documentNumber,String passportCountry,String passportIssue,String expiration,String visaCountry,String visaNumber,String visaIssueDate) throws Exception
	{
		/**
		 * Establish reference to Common Functions
		 */
		CommonFunctions cfs = new CommonFunctions();

		/**
		 * Populate Report Test Case Name
		 */
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Apply Now");
		
		
		/**
		 * Click lnk/btns/rbtn
		 */
		aDriver.click(com.abc.applications.i94.or.I94.lnkAppForNewI94, "Apply For New I-94 Link");
		aDriver.click(com.abc.applications.i94.or.I94.lnkApplyNow, "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.btnConsentContinue, "Consent & Continue");
		aDriver.click(com.abc.applications.i94.or.I94.rbtnviaalandborder, "via a land border");
		/**
		 * TYpe firstName,lastName
		 */
		aDriver.type(com.abc.applications.i94.or.I94.txtFirstName, firstName, "First Name");
		aDriver.type(com.abc.applications.i94.or.I94.txtLastName, lastName, "Last Name");

		/**
		 * Call Function to split birth - Input field value: dd/mm/yyyy - Type Birth Date Fields - Day. Month, Year
		 */
		String[] ans = cfs.DateSplit(birth);
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthDay, ans[0], "Birth Day");
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthMo, ans[1], "Birth Month");
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthYear, ans[2], "Birth Year");

		/**
		 * Call Gender function - (Input field values are: M/F/O) - and click Male,Female,or Other 
		 */
		CommonFunctions.Gender(Gender);

		/**
		 * Click   btpassport  
		 */
		aDriver.click(com.abc.applications.i94.or.I94.rbtpassport, "Passport");
		
		/**
		 * Type   txtPassportNumber  
		 */
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportNumber, documentNumber, "Document Number");

		/**
		 * Call Function to get countryName and Type CcountryName (Input field value is 3 byte ISO country code
		 */
		String countryName = cfs.isoCountrycode(passportCountry);
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportCountry, countryName, "Passport Country of Issue");

		/**
		 * Call Function to split Dates
		 */
		String[] ans2 = cfs.DateSplit(passportIssue);
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportIssueDay, ans2[0], "Issue Day");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportIssueMonth, ans2[1], "Issue Month");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportIssueYear, ans2[2], "Issue Year");

		String[] ans3 = cfs.DateSplit(expiration);
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportExpirationDay, ans3[0], "Passport Expiration Day");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportExpirationMonth, ans3[1], "Passport Expiration Month");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportExpirationYear, ans3[2], "Passport Expiration Year");

		aDriver.type(com.abc.applications.i94.or.I94.txtVisaCountry, visaCountry,"Visa Country of Issuance");
		aDriver.type(com.abc.applications.i94.or.I94.txtVisaNumber, visaNumber, "Visa Number");

		String[] ans4 = cfs.DateSplit(visaIssueDate);
		aDriver.type(com.abc.applications.i94.or.I94.txtVisaIssueDay, ans4[0], "Visa Issue Day");
		aDriver.type(com.abc.applications.i94.or.I94.txtVisaIssueMonth, ans4[1], "Visa Issue Month");
		aDriver.type(com.abc.applications.i94.or.I94.txtVisaIssueYear, ans4[2], "Visa Issue Year");

		/**
		 * Print Last Page
		 */
		cfs.screenPrint();

		//Thread.sleep(2000);
	}

	public void ApplyNowNilo(String firstName,String lastName,String birth,String Gender,String documentNumber,String passportCountry) throws Exception
	{
		/**
		 * Establish reference to Common Functions
		 */
		CommonFunctions cfs = new CommonFunctions();

		/**
		 * Click
		 */

		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.lnkAppForNewI94, "Apply For New I-94 Link");
		aDriver.click(com.abc.applications.i94.or.I94.lnkApplyNow, "Apply Now");
		aDriver.click(com.abc.applications.i94.or.I94.btnConsentContinue, "Consent & Continue");
		aDriver.click(com.abc.applications.i94.or.I94.rbtnviaalandborder, "via a land border");
		
		/**
		 * Type
		 */
		aDriver.type(com.abc.applications.i94.or.I94.txtFirstName, firstName, "First Name");
		aDriver.type(com.abc.applications.i94.or.I94.txtLastName, lastName, "Last Name");

		String[] ans = cfs.DateSplit(birth);
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthDay, ans[0], "Birth Day");
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthMo, ans[1], "Birth Month");
		aDriver.type(com.abc.applications.i94.or.I94.txtBirthYear, ans[2], "Birth Year");

		cfs.Gender(Gender);
		String countryName = cfs.isoCountrycode(passportCountry);
		
		aDriver.click(com.abc.applications.i94.or.I94.rbtpassport, "Passport");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportNumber, documentNumber, "Document Number");
		aDriver.type(com.abc.applications.i94.or.I94.txtPassportCountry, countryName, "Passport Country of Issue");


		//Thread.sleep(2000);
	}


	public void GroupUpload(String firstName,String lastName,String emailAddress) throws Exception
	{
		/**
		 * Establish reference to Common Functions
		 */
		CommonFunctions cfs = new CommonFunctions();

		/**
		 * Populate Report Test Case Name
		 */
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Group Upload");
		
		/**
		 * Click lnk,btn and type data
		 */
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

		/**
		 * Call Function to UploadFile
		 */
		cfs.UploadFile("C:\\Users\\nlibu\\git\\SeleniumHybridFrameWorkExcel\\SeleniumHybridFrameWorkExcel\\TestData\\I94-File-Upload-Template_v0311.xlsx");

		/**
		 * Call Function to get a screenshot
		 */
		cfs.screenPrint();
		

		Thread.sleep(2000);
	}
}
