package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
public WebDriver ldriver;
public Loginpage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	
	
}
//declaration
@FindBy(id="Email")
WebElement emailtxt;
@FindBy(id="Password")
WebElement pwdtxt;
@FindBy(xpath = "//button[text()='Log in']")
WebElement loginbt;
@FindBy(xpath="//a[text()='Logout']")
WebElement logoutbt;
//utilization
public void setEmailtxt(String email)
{
    emailtxt.sendKeys(email);
}
public void setPwdtxt(String pwd)
{
    pwdtxt.sendKeys(pwd);
}
public void clickloginbt(){
    loginbt.click();
}
public void clickonlogout()
{
    logoutbt.click();
}

}
