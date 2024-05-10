package com.stepdefination;

import org.openqa.selenium.support.PageFactory;

import com.keyword.HomePage;
import com.keyword.Keyword;

import io.cucumber.java.en.Then;

public class Demo {
	@Then("send info")

	public void fillUpForm() {
		Keyword keyword = new Keyword();

		HomePage home  = PageFactory.initElements(keyword.driver, HomePage.class);
		home.clickRegister();
	}
}
