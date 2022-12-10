package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountPage1 extends TestBase1 {
	WebDriver driver;

	public AccountPage1(WebDriver driver) {
		this.driver = driver;

	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement button2;

	public void setWhiteBackgroungButton() {
		button2.click();
	}
	

	}
