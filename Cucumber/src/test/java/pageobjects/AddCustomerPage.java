package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	public WebDriver driver;
	public AddCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//declarae the element
	By customermenu=By.xpath("(//i[@class='right fas fa-angle-left '])[2]");
	By custmenuitem=By.xpath("//p[text()=' Customers']");
	By addnewbt=By.xpath("//a[@class='btn btn-primary']");
	By emailtxt=By.id("Email");
			
    By pwdtxt=By.id("Password");
    By firstnametxt=By.id("FirstName");
    By lastnametxt=By.id("LastName");
    By genderfemaleradio=By.id("Gender_Female");
    By Dobbt=By.xpath("//span[@class='k-icon k-i-calendar']");
    By companyname=By.id("Company");
    By istaxexempt=By.id("IsTaxExempt");
    
    //perorm action
    public void setcustomermenu() {
    	driver.findElement(customermenu).click();
    	
    }
    public void setcustomermenuitem() {
    	driver.findElement(custmenuitem).click();
    	
    }
    public void setaddnewbt() {
    	driver.findElement(addnewbt).click();
    	
    }

    public void setemailtxt(String email) {
    	driver.findElement(emailtxt).sendKeys(email);
    	
    }
    
    public void setpwdtxt(String pwd) {
    	driver.findElement(pwdtxt).sendKeys(pwd);
    	
    }
    public void firstnametxt(String firstname) {
    	driver.findElement(firstnametxt).sendKeys(firstname);
    	
    }
    public void lastnametxt(String lastname) {
    	driver.findElement(lastnametxt).sendKeys(lastname);
    	
    }
    public void genderemaleradio() {
    	driver.findElement(genderfemaleradio).click();
    	
    }
    public void Dobbt() {
    	driver.findElement(Dobbt).click();
    	
    }
    public void Dobbt() {
    	driver.findElement(Dobbt).click();
    	
    }
    
    
	
	

}









