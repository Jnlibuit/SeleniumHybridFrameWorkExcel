package com.abc.applications.i736.scripts;

import org.testng.annotations.Test;

import com.abc.applications.i94.actions.I94Actions;
import com.abc.config.StartBrowser;
import com.abc.reuse.CommonFunctions;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class I736ApplyNow extends StartBrowser {
	@Test
	  public void i736ApplyNow() throws Exception 
	  {
		Fillo g = new Fillo();
		
		Connection con = (Connection) g.getConnection("TestData/I94-File-Upload-Template_v0311.xlsx");
		String strQuery = "Select * from Applicationstest";
		Recordset recordset = con.executeQuery(strQuery);
						
		
		 CommonFunctions cfs = new CommonFunctions();
		  
		 I94Actions i94a = new I94Actions ();
		 
		 String linkurl = cfs.geturl  ("/i736config");
		 
		  while(recordset.next()){
			  
			  cfs.NavigateToHomePage(linkurl);
			
			 
		  

		  }
		 
		  
		 Thread.sleep(3000);
	  }

}
