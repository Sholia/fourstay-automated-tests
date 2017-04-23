package com.stay.stepdefs;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import com.fourstay.utilities.Driver;
import com.stay.pageobjects.HomePage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefs {
	@Given("^I run this$")
	public void i_run_this() throws Throwable {
	    Driver.getInstance().get("http://google.com");
	}

	@Then("^It should pass$")
	public void it_should_pass() throws Throwable {
		HomePage home=new HomePage();
		home.search.sendKeys("something");
	    Assert.assertTrue(Driver.getInstance().getTitle().contains("Google"));
	home.search2.sendKeys("something");
	}
}
