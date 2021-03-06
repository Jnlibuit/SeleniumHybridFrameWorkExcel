package com.abc.applications.sample.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.abc.applications.sample.reuse.CommonFunctions;
import com.abc.config.StartBrowser;
import com.abc.wdcmds.ActionDriver;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;



public class SigninSignout extends StartBrowser {
	@Test
	public void testSiginSignout () throws Exception 
	{
		CommonFunctions cfs = new CommonFunctions();
		Fillo f = new Fillo();

		Connection con = (Connection) f.getConnection("TestData/Data.xlsx");
		String strQuery = "Select * from TC1";
		Recordset recordset = con.executeQuery(strQuery);

		

		while(recordset.next()) 
		{
			cfs.Signin(recordset.getField("UserName"),recordset.getField("Password"));

			//System.out.println(recordset.getField("UserName")+ "" +  recordset.getField("Password"));
			cfs.Signout();

			//String textProblem=ActionDriver.getText(com.abc.applications.sample.objectrepository.SigninPage.msgproblem);
			//Assert.assertEquals(textProblem, "There was a problem");

			//StartBrowser.childTest.pass("Verification done successfully on an invalid email id");


		}

	}



}
