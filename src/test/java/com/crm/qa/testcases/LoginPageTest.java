package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AddToCart;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	AddToCart addtocart;
	
	public LoginPageTest()
	{
		super();
		
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	 @Test
	    public void test1() throws IOException, InterruptedException {

		 loginPage.login();;
		// addtocart.homepage();
	       


	    }
}
