package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.HomeTask;
import Tasks.SelectProductTask;

public class RealizarCompraComSucessoTest extends TestBase {
	
	private WebDriver driver = this.getDriverManager();

	HomeTask homeTask = new HomeTask(driver);
	SelectProductTask selectProductTask = new SelectProductTask(driver);
	CheckoutTask checkoutTask = new CheckoutTask(driver);
	FinishTask finishTask = new FinishTask(driver);
	
	@Test
	public void realizarCompra() throws InterruptedException {
		
		homeTask.efetuarLogin();
		selectProductTask.selecionarProduto();
		checkoutTask.preencherForm();
		finishTask.finalizarCompra();
		

	}
}
