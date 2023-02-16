package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.TestBase;
import Framework.Report.Report;
import Framework.Report.ReportType;
import Framework.Report.Screenshot;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.HomeTask;
import Tasks.SelectProductTask;

public class RealizarCompraComSucessoPropertiesValidaFormTest extends TestBase {
	
	private WebDriver driver = this.getDriverManager();

	HomeTask homeTask = new HomeTask(driver);
	SelectProductTask selectProductTask = new SelectProductTask(driver);
	CheckoutTask checkoutTask = new CheckoutTask(driver);
	FinishTask finishTask = new FinishTask(driver);
	
	@Test
	public void realizarCompra()  {
		
		try {
		
			Report.createTest("Realizar Compra com Sucesso via Properties validando o form", ReportType.GROUP);
			Report.createStep("Realizar Login");
			homeTask.efetuarLoginProperties();
			Report.createStep("Selecionar Produto e Realizar Checkout");
			selectProductTask.selecionarProduto();
			checkoutTask.preencherForm2();
			Report.createStep("Finalizar a Compra");
			finishTask.finalizarCompra();
		
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}
	}

}