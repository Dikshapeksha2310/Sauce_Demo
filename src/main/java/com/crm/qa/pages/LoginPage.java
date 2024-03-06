package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	
	@FindBy(xpath="//div[text()='Swag Labs']")
	WebElement Text;
	
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		public void login() {
			String uname = prop.getProperty("username");
			String passwd = prop.getProperty("password");
			username.sendKeys(uname);
			password.sendKeys(passwd);
			String Expected=Text.getText();
			String Actual="Swag Labs";
			loginbutton.click();
		 
		//Assert.assertTrue(Text.isDisplayed());
		Assert.assertEquals(Expected, Actual);
			System.out.println("title is matches");
			//System.out.println();
			//return true;
		}
}
