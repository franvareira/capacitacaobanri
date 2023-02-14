package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FakersGeneration;
import PageObjects.CheckoutPage;
import Validations.CheckoutValidation;
import Validations.GenericValidation;

public class CheckoutTask {
	
	private WebDriver driver;
	private CheckoutPage checkoutPage;
	private GenericValidation genericValidation;
	private CheckoutValidation checkoutValidation;
	private FakersGeneration fakers;
	
	public CheckoutTask(WebDriver driver) {
		
		this.driver = driver;
		checkoutPage = new CheckoutPage(this.driver);
		genericValidation = new GenericValidation(this.driver);
		checkoutValidation = new CheckoutValidation(this.driver);
		fakers = new FakersGeneration();
	}

	public void preencherForm() {
		
		checkoutPage.getFirstNameTextField().sendKeys(fakers.getFirstName());
		checkoutPage.getLastNameTextField().sendKeys(fakers.getLastName());
		checkoutPage.getZipTextField().sendKeys(fakers.getZipCode());
		checkoutValidation.validationForm();
		checkoutPage.getContinueButton().click();
		genericValidation.validationPageCheckoutOverview();
		genericValidation.validationProduct();
		checkoutPage.getFinishButton().click();
		genericValidation.validationPageFinish();
		
	}
}
