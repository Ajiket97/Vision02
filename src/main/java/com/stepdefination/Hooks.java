package com.stepdefination;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.keyword.Keyword;
import com.keyword.Locators;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	Keyword keyword = new Keyword();

	@Before
	public void launchBrowserAppUrl() {
	keyword.openBrowser();
	keyword.OpenUrl(Locators.APPURL);
	}
	@After
	public void closeBrowser() {
    keyword.quitBrowser();
	}

}
