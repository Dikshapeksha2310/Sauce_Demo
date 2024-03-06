package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddToCart;
import com.crm.qa.pages.CheckoutPage;
import com.crm.qa.pages.LoginPage;

public class AddToCartTest extends TestBase {
//	LoginPageTest
	LoginPage loginPage;
	AddToCart addToCart;
	CheckoutPage checkoutPage;
	
	public AddToCartTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		
		loginPage = new LoginPage();
		addToCart=new AddToCart();
		//addToCart = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test
	public void addtocartdetails() {
		loginPage.login();
		addToCart.addToCart();
		
	}
	/*@Test
	public void verifydetailsitem() {
		String productname=addToCart.itemname();
		String expectedname="Sauce Labs Backpack";
		Assert.assertEquals(productname, expectedname);
		System.out.println("Item product matched");
	}
	public void verifydetailsprice() {
		String productname=addToCart.itemprice();
		String expectedname="29.99";
		Assert.assertEquals(productname, expectedname);
		System.out.println("Item price matched");
	}
	*/
	//@Test
	/*public void itemCarted() {
		
		checkoutPage = addToCart.addToCart();
		System.out.println("item is carted");
		
		*/
	

	
}
