package com.abc.applications.i94.scripts;

import org.testng.annotations.Test;

import com.abc.applications.i94.actions.I94Actions;
import com.abc.config.StartBrowser;
import com.abc.reuse.CommonFunctions;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class I94ApplyNow extends StartBrowser {
	@Test

	public void I94testApplyNow() throws Exception 
	{
		/**
		 * Establish reference to Common Functions
		 */
		CommonFunctions cfs = new CommonFunctions();
		/**
		 * Establish reference to I94 Functions
		 */	
		I94Actions i94a = new I94Actions ();
		
		/**
		 * Get Config Properties
		 */
		String linkurl = cfs.processInput  ("/I94config");
		
		/**
		 * Establish Excel File Connection
		 */
		
		Fillo g = new Fillo();

		Connection con = (Connection) g.getConnection("TestData/I94-File-Upload-Template_v0311.xlsx");
		String strQuery = "Select * from Applicationstest";
		Recordset recordset = con.executeQuery(strQuery);

		/**
		 * Test Script
		 */
		while(recordset.next()){

			cfs.NavigateToHomePage(linkurl);


			i94a.ApplyNow(recordset.getField("First Name"),recordset.getField("Last Name"),recordset.getField("Birth Date"),recordset.getField("Gender"),recordset.getField("Document Number"),recordset.getField("Passport Country of Issue"),recordset.getField("Passport Issue Date"),recordset.getField("Passport Expiration Date"),recordset.getField("Visa Country of Issuance"),recordset.getField("Visa Number"),recordset.getField("Visa Issue Date"));
			
		}
		
	}

}
