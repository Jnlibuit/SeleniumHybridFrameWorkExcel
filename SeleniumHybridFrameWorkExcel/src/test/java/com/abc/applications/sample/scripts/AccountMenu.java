package com.abc.applications.sample.scripts;

import org.testng.annotations.Test;

import com.abc.config.StartBrowser;
import com.abc.reuse.CommonFunctions;

public class AccountMenu extends StartBrowser {
  @Test
  public void testAccountMenu() throws Exception 
  {
	  CommonFunctions cfs = new CommonFunctions();
	  cfs.NavigateToHomePage("https://www.amazon.com/");
	  //cfs.AccountMenu();
	  
	Thread.sleep(8000);
  }
}
