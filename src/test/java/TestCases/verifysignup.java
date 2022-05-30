package TestCases;

import java.io.IOException;


import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import Pageobjectmodel.signinPageobject;
import Pageobjectmodel.signupPageobject;
import Resources.BaseClass;
import Resources.constants;


public class verifysignup extends BaseClass  {
	
	
	@Test
	public void signUpdata() throws InterruptedException {
		signinPageobject spo=new signinPageobject(driver);
		spo.openSignup().click();
		Thread.sleep(5000);
	   signupPageobject sup=new signupPageobject(driver);
	   sup.enterFirstname().sendKeys(constants.firstName);
	   sup.enterLastname().sendKeys(constants.lastName);
	   sup.enterMail().sendKeys("abc@gmail.com");
	   Select s=new Select(sup.selectemploye());
	   Thread.sleep(5000);
	   s.selectByIndex(1);
	   }
	  
}