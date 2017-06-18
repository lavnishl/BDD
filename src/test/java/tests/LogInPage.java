package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {
	
	WebDriver driver;
	
	public LogInPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement username;

	@FindBy(xpath="//input[@id='pass']")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	public WebElement LoginButton;
	
	@FindBy(xpath="//img[starts-with(@id,'profile_pic_welcome_')]")
	public WebElement profileimage;
	
	
	public void clicklogin(){
		LoginButton.click();
	}

	// writing in a text field / select value from a list
	public void inputUN(String data){
		username.sendKeys(data);
	}
	
	public void inputPass(String data){
		password.sendKeys(data);
	}
	public void verifyTitle(){
		
	}
	
		
	public void verifyText(){
		
	}        

}
