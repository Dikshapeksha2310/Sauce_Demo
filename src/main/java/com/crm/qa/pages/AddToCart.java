package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class AddToCart extends TestBase {

	@FindBy(xpath="(//div[@class=\"inventory_item_price\"])[1]")
	WebElement itemprice;
	
	@FindBy(xpath="(//div[@class=\"inventory_item_name \"])[1]")
	WebElement itemname;
	
	@FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement Addbutton;
	
	@FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
	WebElement carticon;
	@FindBy(id="checkout")
	WebElement checkout;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	WebElement pname;
	
	@FindBy(xpath="//div[@class=\"inventory_item_price\"]")
	WebElement price;
	
	public AddToCart(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void addToCart() {
		
		String iname=itemname.getText();
		System.out.println(iname);
		
		
		
		String iprice=itemprice.getText();
		System.out.println(iprice);
		
		
		Addbutton.click();
		carticon.click();
		String proname=pname.getText();
		Assert.assertEquals(iname, proname);
		System.out.println("Item Matches*********");
		String pprice=price.getText();
		Assert.assertEquals(iprice, pprice);
		System.out.println("Item price Matches********8");
	
	}
	
	
	
}
