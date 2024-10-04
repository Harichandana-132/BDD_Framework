package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageobjects.Loginpage;

public class Steps {
	public WebDriver driver;
	public Loginpage lp;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user-dir"+"//Drivers/chromedriver.exe"));
		driver=new ChromeDriver();
		lp=new Loginpage(driver);
	}

	@Given("user opens URL {string}")
	public void user_opens_url(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(2000);
	   
	}

	@When("user Enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String pwd) throws InterruptedException {
		lp.setEmailtxt(email);
		Thread.sleep(2000);
		lp.setPwdtxt(pwd);
		Thread.sleep(2000);
		  
		  
	   
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		lp.clickloginbt();
		Thread.sleep(2000);
		  
	    
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
	    if(driver.getPageSource().contains("login was successful"))
	    {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }
	    else
	    {
	    	Assert.assertEquals(title,driver.getTitle());
	    }
	}

	@When("User click on logout")
	public void user_click_on_logout() throws InterruptedException {
		lp.clickonlogout();
		Thread.sleep(2000);
		  
	    
	}

	@When("close browser")
	public void close_browser() {
	    driver.quit();
	}


}
