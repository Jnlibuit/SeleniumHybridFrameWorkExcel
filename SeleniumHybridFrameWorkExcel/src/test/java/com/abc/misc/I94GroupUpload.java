package com.abc.misc;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;

import org.testng.annotations.Test;

import com.abc.applications.i94.actions.I94Actions;
import com.abc.config.StartBrowser;
import com.abc.reuse.CommonFunctions;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class I94GroupUpload extends StartBrowser{
	@Test
	public void I94testGroupUpload() throws Exception 
	{
		/**
		 * Establish reference to Common Functions
		 */
		CommonFunctions cfs = new CommonFunctions();

		I94Actions i94a = new I94Actions ();

		/**
		 * Get Config Properties
		 */
		String linkurl = cfs.processInput  ("/I94config");

		/**
		 * Establish Excel File Connection
		 */
		Fillo g = new Fillo();

		Connection con = (Connection) g.getConnection("TestData/GlobalData.xlsx");
		String strQuery = "Select * from Applications where TestId = 'I94testGroupUpload'";
		Recordset recordset = con.executeQuery(strQuery);

		/**
		 * Test Script
		 */

		while(recordset.next()){

			cfs.NavigateToHomePage(linkurl);

			i94a.GroupUpload(recordset.getField("First Name"),recordset.getField("Last Name"),recordset.getField("Email Address"));


		}
		
	}

}
