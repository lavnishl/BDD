package tests;
import java.io.IOException;

import org.junit.After;

import org.junit.Before;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseTest;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class loginTest extends BaseTest {
	
	private LogInPage logp= null;
	
	//Scenario steps begins below
	
	@Before
	public void setupenvi()
	
	{
		System.out.println("Logging in facebook");
	}
	
	
		
	@Given("^I go to facebook on \"([a-zA-Z]{1,})\"$")
	public void gotoFacebook(String browserType) throws IOException{
		System.out.println("Going to facebook on "+browserType);
		setup();
		init();
		
		}
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void inputuser(String object,String data){
		
		System.out.println("Entering in "+ object +" as " + data);
		logp=PageFactory.initElements(driver, LogInPage.class);
		
	}
		
	@And("I click on \"([a-zA-Z]{1,})\"$")
	public void click(String object){
		System.out.println("Clicking "+ object);
		logp.clicklogin();
		}
	@Then("login should be \"([a-zA-Z]{1,})\"$")
	public void verifyLogin(String expectedReslt){
		System.out.println("Expected Result  - "+ expectedReslt);
		//Assert.assertTrue("Login not successful", );
		}
	
	//Scenario steps end here
		
	//Scenario Outline steps begins below
	
	@And("^I enter username as \"([^\"]*)\"$")
	public void inputusename(String data){
		System.out.println("Entering in value "+ data);
		logp=PageFactory.initElements(driver, LogInPage.class);
		logp.inputUN(data);
		
	}
	
	@And("^I enter password as \"([^\"]*)\"$")
	public void inputpassword(String data){
		System.out.println("Entering in value "+ data);
		logp.inputPass(data);
	}
	@Then("^I verify the \"([^\"]*)\" in step$")
		public void verifyLoginFail(String expectedReslt){
			System.out.println("Expected Result  - "+ expectedReslt);
			//Assert.assertTrue("Login not successful", logp.isElementPresent("profileimage"));
	}
	
	@After
	public void Tearenvir()
	{
		tearDown();
	}	
}
