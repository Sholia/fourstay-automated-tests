package com.stay.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.fourstay.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
	@Before 
	public void setUp(){
		Driver.getInstance().manage().timeouts().implicitlyWait(3,  TimeUnit.SECONDS);
		//Driver.getInstance().manage().window().maximize();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		// this method takes a screenshot if the current scenario fails
		 if (scenario.isFailed()) {
			   final byte[] screenshot = ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.BYTES);
			   scenario.embed(screenshot, "image/png");
			  }
		Driver.getInstance().quit();
	}
}
