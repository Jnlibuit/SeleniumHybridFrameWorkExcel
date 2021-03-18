package com.abc.applications.i94.scripts;

import org.testng.annotations.Test;

import com.abc.applications.i94.actions.I94Actions;
import com.abc.config.StartBrowser;
import com.abc.reuse.CommonFunctions;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ApplyNow extends StartBrowser {
	@Test
	  public void testApplyNow() throws Exception 
	  {
		Fillo g = new Fillo();
		
		Connection con = (Connection) g.getConnection("TestData/I94-File-Upload-Template_v0311.xlsx");
		String strQuery = "Select * from Applicationstest";
		Recordset recordset = con.executeQuery(strQuery);
						
		
		 CommonFunctions cfs = new CommonFunctions();
		  
		 I94Actions i94a = new I94Actions ();
		 
		  while(recordset.next()){
			  
			  cfs.NavigateToHomePage("https://i94.cbp.dhs.gov/I94/#/home");
				 
			  i94a.ApplyNow(recordset.getField("First Name"),recordset.getField("Last Name"),recordset.getField("Birth Day"));
			  
			  
			  //cfs.AccountMenu();
			  
			 Thread.sleep(3000);
			
		  }
		  
		  //cfs.NavigateToHomePage("https://i94.cbp.dhs.gov/I94/#/home");
		 
		  //i94a.ApplyNow();
		  
		  
		  //cfs.AccountMenu();
		  
		 Thread.sleep(3000);
	  }

}
