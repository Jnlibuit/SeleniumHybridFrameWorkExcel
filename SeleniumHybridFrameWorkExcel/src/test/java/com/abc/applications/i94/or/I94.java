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
	
	public static By txtGroupFirstName = By.xpath("//input[@id='groupContactFirstName']");
	
	public static By txtGroupLastName = By.xpath("//input[@id='groupContactLastName']");
	
	public static By txtGroupEmailAddress = By.xpath("//input[@id='groupContactEmail']");
	
	public static By txtGroupConfirmEmailAddress = By.xpath("//input[@id='groupConfirmContactEmail']");
	
	
	
	

	
	
}
