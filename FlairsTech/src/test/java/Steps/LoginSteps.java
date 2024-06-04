package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import com.Innocrm.base.base;

import config.com.pages.HomePage;
import config.com.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class LoginSteps extends base {
	LoginPage login;
	HomePage homepage;
	@Given("user come to the web site and go to login page")
	public void user_come_to_the_web_site_and_go_to_login_page()
	{ 

		launchbrowser();
			
	}
	@When("user fill in email as {string} and password as {string} and press login")
	public void user_fill_in_email_and_password_and_press_login(String user, String pass) {

		login= new LoginPage();
		homepage= login.performlogin(user, pass);
 	}
	
	
 
	
	@And("user fill in fname as {string} and lname as {string} and zcode as {string}" )
	public void user_fill_his_data(String fname, String lname,String zcode) {

		login= new LoginPage();	  
		  login.checkout_info(fname, lname, zcode);
	    

	}
	
	
	
	
	
	
	
	
	
	
 
	
	@Then("user should navigate to home page")
	public void user_should_navigate_to_home_page() throws InterruptedException {
	     Thread.sleep(10000); 

		Assert.assertEquals(driver.getTitle(),"Swag Labs");

		

		
		// invalid scenario
		
		
	}
	
	
	
	@Then("check invoice price is right")
	public void price_after_check() throws InterruptedException {
		login= new LoginPage();	  

	    String beforeprice = login.price1l();
        String aftereprice = login.price2l();
         
        Assert.assertEquals(beforeprice,aftereprice);
 
 		login.finish();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Then("error message should appear")
	public void error_message_should_appear() {
		Assert.assertTrue(driver.findElement(By.name("username")).isDisplayed());


	}
	
	@Then("user should be redirected to the login page again")
	public void user_should_be_redirected_to_the_login_page_again() {
		login= new LoginPage();

		Assert.assertEquals(driver.getTitle(),login.loginpageurl);


	}
	@AfterTest
	public void teardown ()
	{
		driver.quit();

	}
	
	
	
	

}
