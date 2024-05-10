package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.keyword.HomePage;
import com.keyword.Keyword;
import com.keyword.Locators;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	RemoteWebDriver d;
    
	@Given("browser is lanuched")
	public void openBrowser() {
		d = new ChromeDriver();
	}

	@And("application is launched successfully in browser")
	public void launchApp() {
		d.get("https://parabank.parasoft.com/parabank/index.htm");
	}

	@When("user fild entire form with invalid mobile number")
	public void fillForm() {

		d.findElement(By.cssSelector("#loginPanel > p:nth-child(3) > a")).click();
		d.findElement(By.cssSelector("input[id='customer.firstName']")).sendKeys("ajit");
		d.findElement(By.cssSelector("input[id='customer.address.street']")).sendKeys("telhara");
		d.findElement(By.cssSelector("input[id='customer.address.city']")).sendKeys("telhara");
		d.findElement(By.cssSelector("input[id='customer.address.state']")).sendKeys("maf");
		d.findElement(By.cssSelector("input[id='customer.address.zipCode']")).sendKeys("441088");
		d.findElement(By.cssSelector("input[id='customer.phoneNumber']")).sendKeys("9876543210");
		d.findElement(By.cssSelector("input[id='customer.ssn']")).sendKeys("585479j");
		d.findElement(By.cssSelector("input[id='customer.username']")).sendKeys("ajit");
		d.findElement(By.cssSelector("[id='customer.password']")).sendKeys("Ajit@123");
		d.findElement(By.cssSelector("input[id='repeatedPassword']")).sendKeys("Ajit@123");

	}

	@And("click submit button")

	public void submitForm() {
		d.findElement(By.cssSelector("td>input[type='submit']")).click();

	}

	@Then("user should gert error masg")

	public void errorMsgGet() {
		String msg = "Last name is required.";
		String errormsg = d.findElement(By.cssSelector("span[id='customer.lastName.errors']")).getText();
		Assert.assertEquals(msg, errormsg);
	}
}
