package com.qvision.metlife.pages;

import org.openqa.selenium.WebElement;
import com.qvision.metlife.utils.Helpers;
import org.openqa.selenium.JavascriptExecutor;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class CreateCustomerMetLifePages extends PageObject {

	Helpers help = new Helpers();

	@FindBy(id = "createNewClient")
	WebElement btnNuevoCliente;

	@FindBy(id = "txtCustMgmtFirstName")
	WebElement txtPrimerNombre;

	@FindBy(id = "txtCustMgmtSecondName")
	WebElement txtSegundoNombre;

	@FindBy(id = "txtCustMgmtSecondMiddleName")
	WebElement txtTercerNombre;

	@FindBy(id = "txtCustMgmtLastName")
	WebElement txtPrimerApellido;

	@FindBy(id = "txtCustMgmtSecondSurname")
	WebElement txtSegundoApellido;

	@FindBy(name = "appDataMap['CustomerData.Party.Person.DateOfBirth']")
	WebElement cldFechaDeNacimiento;

	@FindBy(id = "countryBirth")
	WebElementFacade sltNacionalidad;

	@FindBy(id = "male")
	WebElement rdbMasculino;

	@FindBy(id = "female")
	WebElement rdbFamenino;

	@FindBy(id = "smokingStatus")
	WebElement btnFumador;

	@FindBy(id = "selectMaritalStatus")
	WebElementFacade stlEstadoCivil;

	@FindBy(id = "selectOccupation0")
	WebElement txtOcupacion;

	@FindBy(id = "documentType")
	WebElementFacade sltTipoDeIdentificacion;

	@FindBy(id = "documentNumber")
	WebElement txtNumeroDeIdentificacion;

	@FindBy(id = "txtCustMgmtMonthlySalary")
	WebElement txtIngresosMensuales;

	@FindBy(id = "txtEmailAddr")
	WebElement txtEmail;

	@FindBy(id = "selectPhnType0")
	WebElementFacade sltTipoDeTelefono;

	@FindBy(id = "txtPhnNumber0")
	WebElement txtNumeroDeTelefono;

	@FindBy(id = "btnCreateClientConfirm")
	WebElement btnGuardarCliente;

	//@FindBy(id = "btnSearchClient")
	//WebElement btnMenuClientes;
	
	
	
	

	/*public void pageCreateCustomer() {
		btnNuevoCliente.click(); 
		waitFor(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='throbberDiv']/div[2]")));
		txtPrimerNombre.isDisplayed();
	}*/

	public void typeInForm(String primerNombre, String segundoNombre, String tercerNombre, String primerApellido,
			String segundoApellido, String fechaDeNacimiento, String nacionalidad, String genero, String clienteFumador,
			String estadoCivil, String ocupacion, String tipoIdentificacion, String numeroIdentificacion,
			String ingresosMensuales, String email, String tipoTelefono, String numeroTelefono) {
		help.wait(1000);
		btnNuevoCliente.click(); 
		help.wait(8000);
		txtPrimerNombre.sendKeys(primerNombre);
		txtSegundoNombre.sendKeys(segundoNombre);
		txtTercerNombre.sendKeys(tercerNombre);
		txtPrimerApellido.sendKeys(primerApellido);
		txtSegundoApellido.sendKeys(segundoApellido);
		((JavascriptExecutor) getDriver())
				.executeScript("document.getElementById('txtCustMgmtDateOfBirth').value='" + fechaDeNacimiento + "'");
		sltNacionalidad.click();
		help.wait(2000);
		sltNacionalidad.selectByVisibleText(nacionalidad);
		if (genero.equals("M")) {
			rdbMasculino.click();
		} else {
			rdbFamenino.click();
		}

		if (clienteFumador.equals("Si")) {
			btnFumador.click();
		}
		stlEstadoCivil.click();
		help.wait(3000);
		stlEstadoCivil.selectByVisibleText(estadoCivil);
		txtOcupacion.sendKeys(ocupacion);
		help.wait(2000);
		sltTipoDeIdentificacion.selectByVisibleText(tipoIdentificacion);
		help.wait(2000);
		//((JavascriptExecutor) getDriver())
		//.executeScript("document.getElementById('documentNumber').value='" + numeroIdentificacion + "'");
		txtNumeroDeIdentificacion.sendKeys(numeroIdentificacion);
		txtIngresosMensuales.sendKeys(ingresosMensuales);
		txtEmail.sendKeys(email);
		sltTipoDeTelefono.click();
		sltTipoDeTelefono.selectByVisibleText(tipoTelefono);
		txtNumeroDeTelefono.sendKeys(numeroTelefono);
		btnGuardarCliente.click();
		help.wait(4000);
		
				
	}

	/*
	public void validateCustumer() {

		btnGuardarCliente.click();
		help.wait(4000);
		btnAnalisisNecesidades.click();

	}*/
	
	
}
