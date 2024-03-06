package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FinshPage extends CheckoutPage{
	
	@FindBy(xpath="//button[text()='Finish']")
	WebElement Finish;
	
	@FindBy(xpath="//h2[text()=\"Thank you for your order!\"]")
	WebElement title;
	
	
	
	// Initializing the Page Objects:
			public FinshPage() {
				PageFactory.initElements(driver, this);
			}
			
			public void lastPage() {
				
				Finish.click();
				Assert.assertTrue(title.isDisplayed());
			}

}
