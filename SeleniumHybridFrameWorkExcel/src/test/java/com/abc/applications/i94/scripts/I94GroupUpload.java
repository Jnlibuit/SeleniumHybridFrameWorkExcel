package com.abc.applications.i94.scripts;

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
		
		Fillo g = new Fillo();
		
		Connection con = (Connection) g.getConnection("TestData/I94-File-Upload-Template_v0311.xlsx");
		String strQuery = "Select * from Applicationstest";
		Recordset recordset = con.executeQuery(strQuery);
						
		
		 CommonFunctions cfs = new CommonFunctions();
		  
		 I94Actions i94a = new I94Actions ();
		 
		  while(recordset.next()){
			  
			  cfs.NavigateToHomePage("https://i94.cbp.dhs.gov/I94/#/home");
				 
			  i94a.GroupUpload(recordset.getField("First Name"),recordset.getField("Last Name"),recordset.getField("Email Address"));
				//Use of Robot class to upload file

				


				
				//System.out.println("********");
				//System.out.println(filepath);
				//System.out.println("********");
				//Copy above path to clipboard
							  
			 //Thread.sleep(3000);
			
		  }
		  
		  //cfs.NavigateToHomePage("https://i94.cbp.dhs.gov/I94/#/home");
		 
		  //i94a.ApplyNow();
		  
		  
		  //cfs.AccountMenu();
		  
		 Thread.sleep(3000);
	  }

}
