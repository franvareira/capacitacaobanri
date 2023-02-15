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
	
	
	public void efetuarLogin()  {
		
		loginValidation.validationLoginPage();
		homePage.getUserNameInput().sendKeys("standard_user");
		homePage.getPasswordInput().sendKeys("secret_sauce");
		homePage.getLoginButton().click();
		genericValidation.validationPageProducts();
		
		
	}
	
	public void efetuarLoginCSV(String user, String password)  {
		
		loginValidation.validationLoginPage();
		homePage.getUserNameInput().sendKeys(user);
		homePage.getPasswordInput().sendKeys(password);
		homePage.getLoginButton().click();
		genericValidation.validationPageProducts();
		
		
	}
	
	
}
