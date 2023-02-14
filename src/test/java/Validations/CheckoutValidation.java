package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import PageObjects.CheckoutPage;

public class CheckoutValidation {
	
	private WebDriver driver;
	private CheckoutPage checkoutPage;
	
	public CheckoutValidation(WebDriver driver ) {
		
		this.driver = driver;
		checkoutPage = new CheckoutPage(this.driver);
	}
	
	public void validationForm() {
		
		Assertions.assertFalse(checkoutPage.getFirstNameTextField().getAttribute("value").equalsIgnoreCase(" "));
		
	}

}
