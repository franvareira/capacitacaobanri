package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import PageObjects.GenericPage;

public class GenericValidation {
	
	
	private WebDriver driver;
	private Waits wait;
	private GenericPage genericPage;
	
	public GenericValidation(WebDriver driver) {
		
		this.driver = driver;
		genericPage = new GenericPage(this.driver);
		wait = new Waits(this.driver);

	}
	
	public void validationPageProducts() {
		
		wait.loadElement(genericPage.getHomeTextSpan());
		String label = genericPage.getHomeTextSpan().getText();
		Assertions.assertEquals("PRODUCTS", label);
		
	}
	
	public void validationPageCart() {
		
		wait.loadElement(genericPage.getHomeTextSpan());
		String label = genericPage.getHomeTextSpan().getText();
		Assertions.assertEquals("YOUR CART", label);
		
	}
	
	public void validationProduct() {
		
		wait.loadElement(genericPage.getProductLabel());
		String label = genericPage.getProductLabel().getText();
		Assertions.assertEquals("Sauce Labs Backpack", label);
		
	}
	
	public void validationPageCheckout() {
		
		wait.loadElement(genericPage.getHomeTextSpan());
		String label = genericPage.getHomeTextSpan().getText();
		Assertions.assertEquals("CHECKOUT: YOUR INFORMATION", label);
		
	}
	
	public void validationPageCheckoutOverview() {
		
		wait.loadElement(genericPage.getHomeTextSpan());
		String label = genericPage.getHomeTextSpan().getText();
		Assertions.assertEquals("CHECKOUT: OVERVIEW", label);
		
	}
	
	public void validationPageFinish() {
		
		wait.loadElement(genericPage.getHomeTextSpan());
		String label = genericPage.getHomeTextSpan().getText();
		Assertions.assertEquals("CHECKOUT: COMPLETE!", label);
		
	}
	
	
	

}
