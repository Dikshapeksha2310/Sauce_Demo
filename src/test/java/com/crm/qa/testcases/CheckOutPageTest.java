package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.AddToCart;
import com.crm.qa.pages.CheckoutPage;
import com.crm.qa.pages.LoginPage;

public class CheckOutPageTest extends AddToCart {

	LoginPage loginPage;
	AddToCart addToCart;
	CheckoutPage checkoutPage;
	
	
	public CheckOutPageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		
		loginPage = new LoginPage();
		addToCart=new AddToCart();
		checkoutPage=new CheckoutPage();
		
		//sucessPage= checkoutPage.productdetails();
	}
	@Test
	public void productcheckout()  {
		loginPage.login();
		addToCart.addToCart();
	//	checkoutPage.verifyproductDetails();
		checkoutPage.checkOutdetails();
	}

	
}
