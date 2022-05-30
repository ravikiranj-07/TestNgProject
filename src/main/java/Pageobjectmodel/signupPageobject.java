package Pageobjectmodel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupPageobject {
	public WebDriver driver;
private By firstName= By.xpath("//input[@name='UserFirstName']");
private By LastName=By.xpath("//input[@name='UserLastName']");
private By EnterWorkEmail=By.xpath(" //input[@name='UserEmail']");
private By employe=By.xpath("//select[@name='CompanyEmployees']");





public signupPageobject() {
	
}
public signupPageobject(WebDriver driver2) {
this.driver=driver2;
}
public WebElement enterFirstname() {
	return driver.findElement(firstName);
	
}
public WebElement enterLastname() {
	return driver.findElement(LastName);
}
public WebElement enterMail() {
	return driver.findElement(EnterWorkEmail);
}
public WebElement selectemploye() {
	return driver.findElement(employe);
}
}
