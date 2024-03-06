package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.pages.AddToCart;
import com.crm.qa.pages.CheckoutPage;
import com.crm.qa.pages.FinshPage;
import com.crm.qa.pages.LoginPage;

public class FinishTest extends CheckoutPage{

	LoginPage loginPage;
	AddToCart addToCart;
	CheckoutPage checkoutPage;
	FinshPage finishtestobj;
	
	public FinishTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		
		loginPage = new LoginPage();
		addToCart=new AddToCart();
		checkoutPage=new CheckoutPage();
		finishtestobj = new FinshPage();
		
		//sucessPage= checkoutPage.productdetails();
	}
	@Test
	public void FinishPage()  {
		loginPage.login();
		addToCart.addToCart();
	//	checkoutPage.verifyproductDetails();
		checkoutPage.checkOutdetails();
		finishtestobj.lastPage();
	}
}

