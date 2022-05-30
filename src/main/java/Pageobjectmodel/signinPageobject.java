package Pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signinPageobject {
public WebDriver driver;

private By username=By.xpath("//input[@id='username']");
private By password=By.xpath("//input[@id='password']");
By login=By.xpath("//input[@id='Login']");
private By tryforFree=By.xpath("//a[@id='signup_link']");

public signinPageobject(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver=driver2;
}


public WebElement enterUsername() {
	return driver.findElement(username);
	
}


public WebElement password() {
	return driver.findElement(password);
	
}
public WebElement login() {
	return driver.findElement(login);
}
public WebElement openSignup() {
	return driver.findElement(tryforFree);
	
}
}