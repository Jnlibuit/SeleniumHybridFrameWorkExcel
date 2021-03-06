package com.abc.applications.sample.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.abc.applications.sample.reuse.CommonFunctions;
import com.abc.config.StartBrowser;
import com.abc.wdcmds.ActionDriver;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;



public class Signin extends StartBrowser {
  @Test
  public void testSigin () throws Exception 
  {
	  CommonFunctions cfs = new CommonFunctions();
	  Fillo f = new Fillo();
	  
	  Connection con = (Connection) f.getConnection("TestData/Data.xlsx");
	  String strQuery = "Select * from TC1";
	  Recordset recordset = con.executeQuery(strQuery);
	 
	  cfs.NavigateToHomePage("https://www.amazon.com/");
	  
	  while(recordset.next());
	  {
	  cfs.Signin(recordset.getField("UserName"),recordset.getField("Password"));
	  
	  String textProblem=ActionDriver.getText(com.abc.applications.sample.objectrepository.SigninPage.msgproblem);
	  Assert.assertEquals(textProblem, "There was a problem");
	  
	  StartBrowser.childTest.pass("Verification done successfully on an invalid email id");
	  }
	  
  }
  
  
 
}
