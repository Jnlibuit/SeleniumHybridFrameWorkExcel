package com.abc.applications.i94.or;

import org.openqa.selenium.By;

public class I94 {
	
	public static By lnkAppForNewI94 = By.xpath("//span[contains(text(),'Apply for New I-94')]");

	public static By lnkApplyNow = By.xpath("//body/div[1]/div[1]/div[2]/div[2]/div[1]/nav[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/div[1]/a[1]/span[1]");
	
	public static By lnkGroupUpload = By.xpath("//span[contains(text(),'Group Upload')]");

	public static By btnConsentContinue = By.xpath("//button[@id='consent']");
	
	public static By rbtnviaalandborder = By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/span[1]/div[7]/div[1]/div[1]/label[1]/span[1]");
	
	public static By txtFirstName = By.xpath("//input[@id='firstName']");
	
	public static By txtLastName = By.xpath("//input[@id='lastName']");
	
	public static By txtBirthDay = By.xpath("//input[@id='birthDay']");
	
	public static By txtBirthMo = By.xpath("//select[@id='birthMonth']");
	
	public static By txtBirthYear = By.xpath("//input[@id='birthYear']");
	
	public static By rbtgendermale = By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/span[1]/div[8]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[1]");
	
	public static By rbtgenderfemale = By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/span[1]/div[8]/div[1]/div[4]/div[2]/div[1]/div[2]/label[1]/span[1]");
	
	public static By rbtgenderother = By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/span[1]/div[8]/div[1]/div[4]/div[2]/div[1]/div[3]/label[1]/span[1]");
	
	public static By rbtpassport = By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/span[1]/div[8]/div[1]/div[7]/div[1]/div[1]/label[1]/span[1]");
	
	public static By txtPassportNumber = By.xpath("//input[@id='passportNumber']");
	
	public static By txtPassportCountry = By.xpath("//select[@id='passportCountry']");
	
	public static By txtPassportIssueDay = By.xpath("//input[@id='passportIssuanceDay']");
	
	public static By txtPassportIssueMonth = By.xpath("//select[@id='passportIssuanceMonth']");
	
	public static By txtPassportIssueYear = By.xpath("//input[@id='passportIssuanceYear']");
	
	public static By txtPassportExpirationDay = By.xpath("//input[@id='passportExpirationDay']");
	
	public static By txtPassportExpirationMonth = By.xpath("//select[@id='passportExpirationMonth']");
	
	public static By txtPassportExpirationYear = By.xpath("//input[@id='passportExpirationYear']");
	
	public static By txtVisaCountry = By.xpath("//select[@id='visaIssuanceCountry']");
	
	public static By txtVisaNumber = By.xpath("//input[@id='visaNumber']");
	
	public static By txtVisaIssueDay = By.xpath("//input[@id='visaIssuanceDay']");
	
	public static By txtVisaIssueMonth = By.xpath("//select[@id='visaIssuanceMonth']");
	
	public static By txtVisaIssueYear = By.xpath("//input[@id='visaIssuanceYear']");
	
	public static By btnNext = By.xpath("//input[@id='nextButton']");
	
	//public static By rbtbcc = By.xpath("//body/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/span[1]/div[8]/div[1]/div[7]/div[1]/div[2]/label[1]/span[1]");
	
	public static By txtGroupFirstName = By.xpath("//input[@id='groupContactFirstName']");
	
	public static By txtGroupLastName = By.xpath("//input[@id='groupContactLastName']");
	
	public static By txtGroupEmailAddress = By.xpath("//input[@id='groupContactEmail']");
	
	public static By txtGroupConfirmEmailAddress = By.xpath("//input[@id='groupConfirmContactEmail']");
	
// Group Upload
	
	public static By btnSubmit = By.xpath("//input[@id='nextButton']");	
	
	public static By btnCreateGroup = By.xpath("//button[contains(text(),'YES, CREATE GROUP')]");
	
	public static By btnChooseExcelFile = By.xpath("//input[@id='importApplications']");
	
	
}
