package com.spicejet.pages;
import com.spicejet.utils.Sewrappers;

public class SJP13_Close_WebBrowser extends Sewrappers {
	public void closeAllBrowsers ()
	{
		driver.quit();
	}
}
