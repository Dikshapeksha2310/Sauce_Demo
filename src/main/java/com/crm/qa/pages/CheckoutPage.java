package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends AddToCart {
	
	
	
	
	@FindBy(xpath="(//div[@class=\"inventory_item_price\"])[1]")
	WebElement itemprice;
	
	@FindBy(xpath="(//div[@class=\"inventory_item_name \"])[1]")
	WebElement itemname;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	WebElement pname;
	
	@FindBy(xpath="//div[@class=\"inventory_item_price\"]")
	WebElement price;
	
	
	@FindBy(id="checkout")
	WebElement checkout;
	
	@FindBy(id="first-name")
	WebElement firstname;
	
	@FindBy(id="last-name")
	WebElement lastname;
	
	@FindBy(id="postal-code")
	WebElement postalcode;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	
	// Initializing the Page Objects:
		public CheckoutPage() {
			PageFactory.initElements(driver, this);
		}
	
		
	/*	public void verifyproductDetails() {
		
			//String iname=itemname.getText();
			String checkname=pname.getText();
			System.out.println(checkname);
			//System.out.println(iname);
			//System.out.println(iprice);
			Assert.assertEquals(checkname, "Sauce Labs Backpack");
			System.out.println("Itemname Matches*****");
		//	String iprice=itemprice.getText();
			String checkpri=price.getText();
			System.out.println(checkpri);
			Assert.assertEquals(checkpri, "$29.99");
			System.out.println("Item price matches");
			
		}*/
		
		public void checkOutdetails()  {
			checkout.click();
			String fname=prop.getProperty("Firstname");
			firstname.sendKeys(fname);
			
			String lname=prop.getProperty("Lastname");
			lastname.sendKeys(lname);
			String zipcode=prop.getProperty("postalcode");
			postalcode.sendKeys(zipcode);
			continuebutton.click();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0 , 400)", "");
			
			
		}
		
		
	//Sauce Labs Backpack
	//29.99

}
