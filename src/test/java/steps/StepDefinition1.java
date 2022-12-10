package steps;

import org.openqa.selenium.By; 
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import pages.AccountPage1;

import pages.TestBase1; 



public class StepDefinition1 extends TestBase1 {
	 
	AccountPage1 accountpage1;
  	 
        @Before
		public void setUp() {
			initDriver1();
			accountpage1 = PageFactory.initElements(driver, AccountPage1.class);
	 }
	
	
	   @Given("^\"([^\"]*)\" button exists$")
	   public void button_exists1(String arg1) { 
		   System.out.println("White Background Color Exist");
			      
	   }

	   @When("^I click on the button$")
	   public void i_click_on_the_button() {
          accountpage1.setWhiteBackgroungButton();
	   }
		
	   @Then("^the background color will change to sky white$")
	   public void the_background_color_will_change_to_white()  {
		   String a = driver.findElement(By.xpath("//*[contains(text(),'white')]")).getCssValue("background-color");
			
	    	Assert.assertEquals("validation successful","rgba(0, 0, 0, 0)", a);
	   }
	   @After
		public void tearDown()  {

			driver.quit();
		}
		
	  
	}
	
