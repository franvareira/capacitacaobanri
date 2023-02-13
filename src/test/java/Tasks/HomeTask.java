package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import Validations.GenericValidation;
import Validations.LoginValidation;

public class HomeTask {

	private WebDriver driver;
	private HomePage homePage;
	private LoginValidation loginValidation;
	private GenericValidation genericValidation;
	
	public HomeTask(WebDriver driver) {
		
		this.driver = driver;
		homePage = new HomePage(this.driver);
		loginValidation = new LoginValidation(this.driver);
		genericValidation = new GenericValidation(this.driver);
		
	}
	
	
	public void efetuarLogin() throws InterruptedException {
		
		loginValidation.validationLoginPage();
		homePage.getUserNameInput().sendKeys("standard_user");
		Thread.sleep(3000);
		homePage.getPasswordInput().sendKeys("secret_sauce");
		Thread.sleep(3000);
		homePage.getLoginButton().click();
		Thread.sleep(3000);
		genericValidation.validationPageProducts();
		
		
	}
	
	
}