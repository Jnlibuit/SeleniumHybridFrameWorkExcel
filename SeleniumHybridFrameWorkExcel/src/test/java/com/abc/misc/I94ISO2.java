package com.abc.misc;

import org.testng.annotations.Test;

import com.abc.applications.i94.actions.I94Actions;
import com.abc.config.StartBrowser;
import com.abc.reuse.CommonFunctions;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class I94ISO2 extends StartBrowser {
	
		@Test
		  public void testI94I94ISO() throws Exception 
		  {
			Fillo g = new Fillo();
			
			Connection con = (Connection) g.getConnection("TestData/I94-File-Upload-Template_v0311.xlsx");
			String strQuery = "Select * from CodesAbbreviations";
			Recordset recordset = con.executeQuery(strQuery);
							
			/*
			 CommonFunctions cfs = new CommonFunctions();
			  
			 I94Actions i94a = new I94Actions ();
			 String linkurl = cfs.processInput  ("/I94config");
			 */
			String countryCode = "";
			String countryName = "";
			  while(recordset.next()){
				  
				  //cfs.NavigateToHomePage(linkurl);
				 countryCode = recordset.getField("ISO Country Code");
				 countryName = recordset.getField("Country Name");
				 
				 //System.out.println(countryCode);
				 //System.out.println(countryName); 
				 
				 System.out.println("String "+recordset.getField("ISO Country Code")+"="+'"'+recordset.getField("ISO Country Code")+'"'+";");
				 //System.out.println("countryName="+ '"'+recordset.getField("Country Name")+'"');
				 //System.out.println("}");
				//	 System.out.println("Country Name Is:"+countryName);
				//} 
				  
				 //String ALB = "ALB";
				  //cfs.AccountMenu();
				  
				 //Thread.sleep(9000);
				
			  }
			  
			  //cfs.NavigateToHomePage("https://i94.cbp.dhs.gov/I94/#/home");
			 
			  //i94a.ApplyNow();
			  
			  
			  //cfs.AccountMenu();
			  
			 Thread.sleep(3000);
		  }
	
	}

 
