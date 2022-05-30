package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjectmodel.signinPageobject;
import Resources.BaseClass;
import Resources.constants;

public class verifySignin extends BaseClass {
	@Test(dataProvider="demo")
	
	public void enterCredentials(String username,String password) {
		signinPageobject spo=new signinPageobject(driver); 
		spo.enterUsername().sendKeys(username);
		 spo.password().sendKeys(password);
		 spo.login().click();
	}
	@DataProvider
	public Object [][] demo(){
		Object [][]data=new Object[2][2];
		//valid data
		data[0][0]=constants.firstuserName;
	    data[0][1]=constants.firstPassword;
		
		//invalid data
		data[1][0]=constants.secondUsername;
		data[1][1]=constants.secondPassword;
		
		return data;
	}
	
	}


//http://rlogiacco.github.io/Natural
