package com.qvision.metlife.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.qvision.metlife.utils.Helpers;


public class NewQuotationsMetLifePages extends PageObject{
	
	Helpers help = new Helpers();
	
	@FindBy (xpath = "//*[@id='planSelection_mainContent']/div/div/nav/div/ul/li[4]")
	WebElement lnkEducativo;
	
	@FindBy (id = "custMgmtaddDependentLink")
	WebElement lnkAdicionarFamilir;
	
	@FindBy (id ="txtCustMgmtDependentFirstName0")
	WebElement txtPrimerNombreFam;
	
	@FindBy (id ="txtCustMgmtDependentMiddleName0")
	WebElement txtSegundoNombreFam;
	
	@FindBy (id ="txtCustMgmtDependentSecondMiddleName0")
	WebElement txtTercerNombreFam;
	
	@FindBy (id ="txtCustMgmtDependentLastName0")
	WebElement txtPrimerApellidoFam;
	
	@FindBy (id ="txtCustMgmtDependentsecondLastName0")
	WebElement txtSegundorApellidoFam;
	
	@FindBy (id ="selectCustMgmtRelationship0")
	WebElementFacade sltRelacionFam;
	
	@FindBy (id ="txtCustMgmtOthrRelationship0")
	WebElement txtOcupacionFam;
	
	@FindBy(id = "male0")
	WebElement rdbMasculino;

	@FindBy(id = "female0")
	WebElement rdbFamenino;
	
	@FindBy (id ="selectCustMgmtDocIdType0")
	WebElementFacade sltTipoDocumenttoFam;
	
	@FindBy (id ="txtCustMgmtDependentIdNumber0")
	WebElement txtDocumentoFam;
	
	@FindBy (id = "btnCustMgmtaddDependent0")
	WebElement btnGuardarFamiliar;
	
	@FindBy (id = "checkboxId0Duplicate")
	WebElement chkSeleccionarFamiliar;
	
	@FindBy (id = "btnAddDependentToQuote")
	WebElement btnContinuar;
	
	@FindBy (id = "radioEdu_AmountToInvestEDU")
	WebElement rdbMontoInvertir;
	
	@FindBy (id ="txtAmountToInvest_EDU")
	WebElement txtMontoInvertir;
	
	@FindBy (id ="typeOfPayment_EDU")
	WebElementFacade sltTipoPago;
	
	@FindBy (id = "txtInsuredValueSchoolYear_EDU")
	WebElement txtValorAsegurado;
	
	@FindBy (id = "missingNoOfYearsToComplete_EDU")
	WebElementFacade sltAnhosFaltantes;
	
	@FindBy (id = "planSubmitEDU")
	WebElement btnCalular;
	
	@FindBy (id = "btnReviewQuote")
	WebElement btnRevisarCotizacion;
	
	@FindBy (id = "endIllustration")
	WebElement btnConfirmacionVenta;
	
	@FindBy (id = "btnMarkCompleteYes")
	WebElement btnSi;

	public void newQuotationPage(String primerNombreFam, String segundoNombreFam, String tercerNombreFam, String primerApellidoFam, 
			String segundorApellidoFam, String relacionFam, String ocupacionFam, String fechaNacimientoFam, String genero, 
			String tipoDocumentoFam, String documentoFam, String montoInvertir, String tipoPago, String valorAsegurado, 
			String anhosFaltantes){
		
		lnkEducativo.click();
		
		WebElement btnAgregarCoti = getDriver().findElements(By.id("btnAddToQuote")).get(27);
		JavascriptExecutor executor = (JavascriptExecutor)getDriver();
		executor.executeScript("arguments[0].click();", btnAgregarCoti);
		help.wait(3000);
		
		WebElement btnCotizar = getDriver().findElement(By.id("btnStartQuote"));
		JavascriptExecutor executor1 = (JavascriptExecutor)getDriver();
		executor1.executeScript("arguments[0].click();", btnCotizar);
		
	   	help.wait(5000);
		lnkAdicionarFamilir.click();
		txtPrimerNombreFam.sendKeys(primerNombreFam);
		txtSegundoNombreFam.sendKeys(segundoNombreFam);
		txtTercerNombreFam.sendKeys(tercerNombreFam);
		txtPrimerApellidoFam.sendKeys(primerApellidoFam);
		txtSegundorApellidoFam.sendKeys(segundorApellidoFam);
		sltRelacionFam.selectByVisibleText(relacionFam);
		txtOcupacionFam.sendKeys(ocupacionFam);
		txtOcupacionFam.sendKeys(Keys.ENTER);
		help.wait(2000);
		((JavascriptExecutor) getDriver())
		.executeScript("document.getElementById('txtCustMgmtDependentDateOfBith0').value='" + fechaNacimientoFam + "'");
         help.wait(1000);
         if (genero.equals("M")) {
        	 rdbMasculino.click();
 		} else {
 			rdbFamenino.click();
 		}
		sltTipoDocumenttoFam.selectByVisibleText(tipoDocumentoFam);
		txtDocumentoFam.sendKeys(documentoFam);
		btnGuardarFamiliar.click();
		help.wait(2000);
		chkSeleccionarFamiliar.click();
		btnContinuar.click();
		help.wait(2000);
		rdbMontoInvertir.click();
		txtMontoInvertir.sendKeys(montoInvertir);
		sltTipoPago.selectByIndex(2);
		txtValorAsegurado.sendKeys(valorAsegurado);
		sltAnhosFaltantes.selectByVisibleText(anhosFaltantes);
		btnCalular.click();
		help.wait(15000);
		btnRevisarCotizacion.click();
		help.wait(3000);	
		btnConfirmacionVenta.click();
		help.wait(2000);	
		btnSi.click();
		help.wait(15000);

	}
	
		
	}
	 
	

