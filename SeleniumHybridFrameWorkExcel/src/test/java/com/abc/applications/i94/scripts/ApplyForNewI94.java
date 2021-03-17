package com.abc.applications.i94.scripts;

import org.testng.annotations.Test;

import com.abc.applications.i94.actions.I94Actions;
import com.abc.config.StartBrowser;
import com.abc.reuse.CommonFunctions;

public class ApplyForNewI94 extends StartBrowser {
	@Test
	  public void testApplyForNewI94() throws Exception 
	  {
		  CommonFunctions cfs = new CommonFunctions();
		  
		  I94Actions i94a = new I94Actions ();
		  
		  cfs.NavigateToHomePage("https://i94.cbp.dhs.gov/I94/#/home");
		 
		  i94a.ApplyNow();
		  
		  
		  //cfs.AccountMenu();
		  
		 Thread.sleep(3000);
	  }

}
