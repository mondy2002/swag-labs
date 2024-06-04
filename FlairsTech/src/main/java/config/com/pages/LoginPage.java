package config.com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Innocrm.base.base;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import junit.framework.Assert;

public class LoginPage extends base{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
		
	
 @FindBy(id="user-name")
 WebElement username;
 @FindBy(id="password")
 WebElement password;
 @FindBy(id="login-button")
 WebElement login;

	
  

 @FindBy(xpath="//select[@data-test='product-sort-container']")
 WebElement selection;
 
 @FindBy(xpath="//a[@id='item_3_title_link']")
 WebElement product;

 @FindBy(xpath="//div[@data-test='inventory-item-price']")
 WebElement product_price ;
 
 @FindBy(xpath="//button[@data-test='add-to-cart']")
 WebElement add_to_cart ;
 
 @FindBy(xpath="//a[@data-test='shopping-cart-link']")
 WebElement cart ;
 
 @FindBy(xpath="//button[@id='checkout']")
 WebElement checkout ;
 
 @FindBy(xpath="//input[@id='first-name']")
 WebElement fname ;
 
 
 @FindBy(xpath="//input[@id='last-name']")
 WebElement lname ;
 
 
 @FindBy(xpath="//input[@id='postal-code']")
 WebElement zcode ;
 
 
 @FindBy(id="continue")
 WebElement continuee;
 
 
 @FindBy(xpath="//div[@data-test='inventory-item-price']")
 WebElement price2 ;
 
 @FindBy(id="finish")
 WebElement finish;
 
 String price1   ; 
 
 
 public String loginpageurl = driver.getTitle();
 public HomePage performlogin (String name, String pass)
 {
	 username.sendKeys(name);
	 password.sendKeys(pass);
	 login.click();
	 Select sort = new Select(selection);
	 
	 sort.selectByIndex(2);
	 
	 product .click(); 
	 price1 = product_price.getText();
	 
 	 
 	 add_to_cart.click();
	 cart.click();
	 checkout.click();
	 
 	 
	 
	 
	 return new HomePage(); 
 }
  
 public  void checkout_info (String fname, String lname,String zcode)
 {
	this.fname.sendKeys(fname); 
   	 
	this.lname.sendKeys(lname); 
	this.zcode.sendKeys(zcode); 
	continuee.click();
	
   }
 public String price1l() {
     return product_price .getText() ;
 }
 public String price2l() {
     return price2.getText() ;
 }

 public  void finish ( )
 {
	  
	finish.click();
	
   }
}
