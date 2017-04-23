package com.stay.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;

public class HomePage {
	private WebDriver driver;
	public HomePage(){
		driver=Driver.getInstance();
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="q")
	@CacheLookup
	public WebElement search;
	
	@FindBy(name="q")
	public WebElement search2;
}
