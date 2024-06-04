package config.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Innocrm.base.base;

import junit.framework.Assert;



public class HomePage extends base {
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='#']")
	 WebElement profilebutton;
	@FindBy(xpath="//a[@href='/logout']")
	 WebElement logoutbutton;
	 
	 

	
	 public void logout() {
		 profilebutton.click();
		 logoutbutton.click();
	 }
}
	 
	
