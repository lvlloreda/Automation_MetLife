package com.qvision.metlife.pages;


import java.io.IOException;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.qvision.metlife.utils.Helpers;


public class NewResquetMetLifePages extends PageObject{
	
	Helpers help = new Helpers();
	
	@FindBy(id = "countryBirth")
	WebElementFacade sltPaisNacimiento;

	@FindBy(id = "txtAppState")
	WebElementFacade stlDeptoNacimiento;
	
	@FindBy(id = "txtAppCity")
	WebElementFacade sltCiudadNacimiento;
			
	@FindBy(id = "noThreeUS")
	WebElement rdbNoCiudadanoAmericano;
		
	@FindBy(id = "fundNo")
	WebElement rdbNoPoderTransferencia;
	
	@FindBy(id = "txtAppHomeAddress")
	WebElement txtDireccionResidencia;
	
	@FindBy(id = "txtAppHomeCountry")
	WebElementFacade sltPaisResidencia;
	
	@FindBy(id = "txtAppHomeState")
	WebElementFacade sltDeptoResidencia;
	
	@FindBy(id = "txtAppHomeCity")
	WebElementFacade stlCiudadResidencia;
	
	@FindBy(id = "txtTelephoneNumber")
	WebElement txtTelefonoResidencia;
	
	@FindBy(id = "yesOne")
	WebElement rdbCpmunicacionSi;
	
	@FindBy(id = "noTwo")
	WebElement rdbTramiteSeguroNo;
			
	@FindBy(id = "noThree")
	WebElement rdbRechazoSeguroNo;
		
	@FindBy(id = "noFour")
	WebElement rdbIndemnizacionNo;
	
	@FindBy (id = "btnInsueredContinue")
	WebElement btnContinuarAsegurado;
	
	@FindBy(id = "sameAsInsuredNo")
	WebElementFacade rdbTomadorPolizaNo;
	
	//@FindBy (id = "btnOwnerContinue")
	//WebElement btnContinuarTomador;
	
	@FindBy (xpath = "//*[@id='addBeneficiary']/button[2]") 
	WebElement btnAgregarBeneficiario;
	
	@FindBy(id = "beneficiaryType0")
	WebElementFacade sltTipoBeneficiario;
	
	@FindBy(id = "beneficiaryDocumentType0")
	WebElementFacade sltTipoDocumentoBen;
	
	@FindBy(id = "beneficiaryDocumentNumber0")
	WebElement txtDocumentoBen;
	
	@FindBy(id = "txtAppSecBeneficiaryName0")
	WebElement txtPrimerNombreBen;
	
	@FindBy(id = "txtAppSecBeneficiarySecondName0")
	WebElement txtSegundoNombreBen;
	
	@FindBy(id = "txtAppSecBeneficiarySurname0")
	WebElement txtPrimerApellidoBen;
	
	@FindBy(id = "txtAppSecBeneficiarySecondSurname0")
	WebElement txtSegundoApellidoBen;
	
	@FindBy(id = "selectAppRelationToInsured0")
	WebElementFacade sltRelacionAsegurado;
	
	//@FindBy(id = "txtCustMgmtDependentDateOfBith0")
	//WebElement txtFechaNacimientoBen;
	
	//@FindBy(id = "male0")
	//WebElement rdbMasculino;

	//@FindBy(id = "female0")
	//WebElement rdbFamenino;
		
	@FindBy (id = "planSelected0")
	WebElementFacade sltPlanBeneficiario;
	
	@FindBy (id = "txtAppSecBeneficiaryAllocation0")
	WebElement txtPorcentaje;
	
	@FindBy (id = "addSecondaryBeneficiary0")
	WebElement btnGuardarBen;
	
	@FindBy (id = "btnbeneficiaryContinue")
	WebElement btnContinuarBefeciario;
	
	@FindBy (id = "noTsix")
	WebElement rdbPreguntaEstiloVida1;
	
	@FindBy (id = "noTseven")
	WebElement rdbPreguntaEstiloVida2;
	
	@FindBy (id = "noTeight")
	WebElement rdbPreguntaEstiloVida3;
	
	@FindBy (id = "noTnine")
	WebElement rdbPreguntaEstiloVida4;
	
	@FindBy (id = "noThirty")
	WebElement rdbPreguntaEstiloVida5;
	
	@FindBy (id = "noThirtyone")
	WebElement rdbPreguntaEstiloVida6;
	
	@FindBy (id = "noThirtytwo")
	WebElement rdbPreguntaEstiloVida7;
	
	@FindBy (id = "noThirtythree")
	WebElement rdbPreguntaEstiloVida8;
	
	@FindBy (id = "noThirtyfour")
	WebElement rdbPreguntaEstiloVida9;
	
	@FindBy (id = "noThirtyfive")
	WebElement rdbPreguntaEstiloVida10;
	
	@FindBy (id = "txtLifestyleHeight")
	WebElement txtEstatura;
	
	@FindBy (id = "txtLifestyleWeight")
	WebElement txtPeso;
	
	@FindBy (id = "noOne")
	WebElement rdbPreguntaSalud1;
	
	@FindBy (id = "noTwo")
	WebElement rdbPreguntaSalud2;
	
	@FindBy (id = "noThree")
	WebElement rdbPreguntaSalud3;
	
	@FindBy (id = "noFour")
	WebElement rdbPreguntaSalud4;
	
	@FindBy (id = "noFive")
	WebElement rdbPreguntaSalud5;
	
	@FindBy (id = "noSix")
	WebElement rdbPreguntaSalud6;
	
	@FindBy (id = "noSeven")
	WebElement rdbPreguntaSalud7;
	
	@FindBy (id = "noEight")
	WebElement rdbPreguntaSalud8;
	
	@FindBy (id = "noNine")
	WebElement rdbPreguntaSalud9;
	
	@FindBy (id = "noTen")
	WebElement rdbPreguntaSalud10;
	
	@FindBy (id = "noEleven")
	WebElement rdbPreguntaSalud11;
	
	@FindBy (id = "noTwelve")
	WebElement rdbPreguntaSalud12;
	
	@FindBy (id = "noThirten")
	WebElement rdbPreguntaSalud13;
	
	@FindBy (id = "noFourten")
	WebElement rdbPreguntaSalud14;
	
	@FindBy (id = "noFiften")
	WebElement rdbPreguntaSalud15;
	
	@FindBy (id = "noSixten")
	WebElement rdbPreguntaSalud16;
	
	@FindBy (id = "noSeventen")
	WebElement rdbPreguntaSalud17;
	
	@FindBy (id = "noEighten")
	WebElement rdbPreguntaSalud18;
	
	@FindBy (id = "noNineten")
	WebElement rdbPreguntaSalud19;
	
	@FindBy (id = "noTwenty")
	WebElement rdbPreguntaSalud20;
	
	@FindBy (id = "noTone")
	WebElement rdbPreguntaSalud21;
	
	@FindBy (id = "noThirtySix")
	WebElement rdbPreguntaSalud22;
	
	@FindBy (id = "noThirtySeven")
	WebElement rdbPreguntaSalud23;
	
	@FindBy (id = "noTtwo")
	WebElement rdbPreguntaSalud24;
	
	@FindBy (id = "noTthree")
	WebElement rdbPreguntaSalud25;
	
	@FindBy (id = "noTfour")
	WebElement rdbPreguntaSalud26;
	
	@FindBy (id = "btnLifestyleContinue")
	WebElement btnContinuarEstiloVida;
	
	@FindBy (id = "leveltwoListaActivity")
	WebElementFacade sltTipoActividad;
	
	@FindBy (id = "txtFinancialidCompany")
	WebElement txtNitEmpresa;
	
	@FindBy (id = "txtFinancialcompanyName")
	WebElement txtNombreEmpresa;
	
	@FindBy (id = "noMetlifeEmployee")
	WebElement rdbEmpleadoMetLifeNo;
	
	@FindBy (id = "economicalActivity")
	WebElement txtActEconomicaEmpresa;
		
	@FindBy (id = "txtFinancialaddressCompany")
	WebElement txtDireccionTrabajo;
	
	@FindBy (id = "leveltwoListaPlaces")
	WebElementFacade sltPaisLugarTrabajo;
	
	@FindBy (id = "stateColombia")
	WebElementFacade sltDeptoLugarTrabajo;
	
	@FindBy (id = "cityColombia")
	WebElementFacade sltCiudadLugarTrabajo;
	
	@FindBy (id = "txtFinancialphoneCompany")
	WebElement txtTelefonoEmpresa;
	
	@FindBy (id = "dropdownEconomy")
	WebElement txtActEconomicaPrincipal;
		
	@FindBy (id = "noFinanceOne")
	WebElement rdbPreguntaInfoLaboral1;
	
	@FindBy (id = "noFinanceTwo")
	WebElement rdbPreguntaInfoLaboral2;
	
	@FindBy (id = "noFinanceThree")	
	WebElement rdbPreguntaInfoLaboral3;
	
	@FindBy (id = "noFinanceFour")	
	WebElement rdbPreguntaInfoLaboral4;
	
	@FindBy (id = "noFinanceFive")	
	WebElement rdbPreguntaInfoLaboral5;
	
	@FindBy (id = "txtFinancialotherMonthlyIncome")
	WebElement txtOtrosIngresos;
	
	@FindBy (id = "leveltwoListaFundOrigin")
	WebElementFacade sltConceptoOtrosIngresos;
	
	@FindBy (id = "incomeCountry")
	WebElementFacade sltPaisOrigenIngresos;
	
	@FindBy (id = "txtassets")
	WebElement txtTotalActvos;
	
	@FindBy (id = "txtmonthlyexpense")
	WebElement txtEgresosMensuales;
	
	@FindBy (id = "txtdebts")
	WebElement txtTotalPasivos;
	
	@FindBy (id = "ListaFundOrigin")
	WebElementFacade sltOrigenFondosAsegurado;
	
	@FindBy (id = "noFinanceTransaction")	
	WebElement rdbPreguntaInfoFinanciera1;
	
	@FindBy (id = "noFinanceTax")	
	WebElement rdbPreguntaDeclaracionImpu1;
	
	@FindBy (id = "btnFinancialContinue") 
	WebElement btnContinuarFinanciacion;
	
	@FindBy (id = "btnSummaryContinue")
	WebElement btnContinuarInfoAsegurado;
	
	@FindBy (id = "noDec")
	WebElement rdbFirmaDeclaracion;
	
	@FindBy (id = "noEsignAgreed")
	WebElement chkAcuerdo;
		
	@FindBy (id = "btnDeclarationContinue")
	WebElement btnContinuarDeclaracion;
	
	@FindBy (id = "paymentMethodCheckBox")
	WebElementFacade sltFormaPago;
	
	@FindBy (id = "refundPaymentSelectDiv")
	WebElementFacade stlOtraFormaPago;
	
	@FindBy (id = "displayVoucher")
	WebElement btnVerReciboPago;
	
	@FindBy (id = "btnpaymentContinue")
	WebElement btnContinuarPago;
	
	@FindBy (id = "fileType")
	WebElementFacade stlCargarDoc;
	
	//@FindBy (id = "fileUploadBtn")
	//WebElement btnSubirDoc;
	
	@FindBy (id = "applicationID")
	WebElement lblIdSolicitud;
	
	@FindBy (id = "btnSubmitComplete")
	WebElement btnPresentarSolicitud;
	
	@FindBy (id = "btnSubmitConfirm")
	WebElement btnConfirmarSolicitud;
	
	public void newResquetPage(String paisNac, String deptoNac, String ciudadNac, String direccionResid, String paisResid, 
			String deptoResid, String ciudadResid, String telefonoResid, String tipoBeneficiario, String tipoDocBene, 
			String documentoBene, String primerNomBene, String segundoNomBene, String primerApellBene, String segundoApellBene, 
			String relacionAsegurado, String fechaNaciBene, String generoBene, String planBene, String porcentaje, String estatura, String peso, 
			String tipoActividad, String nitEmpresa, String nombreEmpresa, String actividadEcoEmpresa, String direTrabajo, 
			String paisTrabajo, String deptoTrabajo, String ciudadTrabajo, String teleEmpresa, String actEconoPrincipal, 
			String otrosIngresos, String paisOrigenIngresos, String totalActivos, String egresosMensuales, String totalPasivos, 
			String origenFondosAseg){
		
		sltPaisNacimiento.selectByVisibleText(paisNac);
		help.wait(2000);
		stlDeptoNacimiento.selectByVisibleText(deptoNac);
		help.wait(2000);
		sltCiudadNacimiento.selectByVisibleText(ciudadNac);
		help.wait(2000);
		rdbNoCiudadanoAmericano.click();
		rdbNoPoderTransferencia.click();
		txtDireccionResidencia.sendKeys(direccionResid);
		sltPaisResidencia.selectByVisibleText(paisResid);
		help.wait(2000);
		sltDeptoResidencia.selectByVisibleText(deptoResid);
		help.wait(2000);
		stlCiudadResidencia.selectByVisibleText(ciudadResid);
		txtTelefonoResidencia.sendKeys(telefonoResid);
		rdbCpmunicacionSi.click();
		rdbTramiteSeguroNo.click();
		rdbRechazoSeguroNo.click();
		rdbIndemnizacionNo.click();
		btnContinuarAsegurado.click();
		help.wait(25000);
		rdbTomadorPolizaNo.click();
		help.wait(2000);
		WebElement btnContinuarTomador = getDriver().findElement(By.id("btnOwnerContinue"));
		JavascriptExecutor executor2 = (JavascriptExecutor)getDriver();
		executor2.executeScript("arguments[0].click();", btnContinuarTomador);
		help.wait(5000);
		btnAgregarBeneficiario.click();
		help.wait(3000);
		sltTipoBeneficiario.selectByVisibleText(tipoBeneficiario);	
		sltTipoDocumentoBen.selectByVisibleText(tipoDocBene);
		txtDocumentoBen.sendKeys(documentoBene);
		txtPrimerNombreBen.sendKeys(primerNomBene);
		txtSegundoNombreBen.sendKeys(segundoNomBene);
		txtPrimerApellidoBen.sendKeys(primerApellBene);
		txtSegundoApellidoBen.sendKeys(segundoApellBene);
		sltRelacionAsegurado.selectByIndex(4);
		((JavascriptExecutor) getDriver())
		.executeScript("document.getElementById('txtCustMgmtDependentDateOfBith0').value='" + fechaNaciBene + "'");
		
		WebElement rdbFamenino = getDriver().findElement(By.id("female0"));
		rdbFamenino.click();
		/*if (generoBene.equals("M")) {
       	 rdbMasculino.click();
		} else {
			rdbFamenino.click();
		}*/
		sltPlanBeneficiario.selectByIndex(1);
		txtPorcentaje.sendKeys(porcentaje);
		btnGuardarBen.click();
		help.wait(3000);
		btnContinuarBefeciario.click();
		help.wait(12000);
		rdbPreguntaEstiloVida1.click();
		rdbPreguntaEstiloVida2.click();
		rdbPreguntaEstiloVida3.click();
		rdbPreguntaEstiloVida4.click();
		rdbPreguntaEstiloVida5.click();
		rdbPreguntaEstiloVida6.click();
		rdbPreguntaEstiloVida7.click();
		rdbPreguntaEstiloVida8.click();
		rdbPreguntaEstiloVida9.click();
		rdbPreguntaEstiloVida10.click();
		txtEstatura.sendKeys(estatura);
		txtPeso.sendKeys(peso);
		rdbPreguntaSalud1.click();
		rdbPreguntaSalud2.click();
		rdbPreguntaSalud3.click();
		rdbPreguntaSalud4.click();
		rdbPreguntaSalud5.click();
		rdbPreguntaSalud6.click();
		rdbPreguntaSalud7.click();
		rdbPreguntaSalud8.click();
		rdbPreguntaSalud9.click();
		rdbPreguntaSalud10.click();
		rdbPreguntaSalud11.click();
		rdbPreguntaSalud12.click();
		rdbPreguntaSalud13.click();
		rdbPreguntaSalud14.click();
		rdbPreguntaSalud15.click();
		rdbPreguntaSalud16.click();
		rdbPreguntaSalud17.click();
		rdbPreguntaSalud18.click();
		rdbPreguntaSalud19.click();
		rdbPreguntaSalud20.click();
		rdbPreguntaSalud21.click();
		rdbPreguntaSalud22.click();
		rdbPreguntaSalud23.click();
		rdbPreguntaSalud24.click();
		rdbPreguntaSalud25.click();
		rdbPreguntaSalud26.click();
		btnContinuarEstiloVida.click();
		help.wait(10000);
		sltTipoActividad.selectByVisibleText(tipoActividad);
		txtNitEmpresa.sendKeys(nitEmpresa);
		txtNombreEmpresa.sendKeys(nombreEmpresa);
		rdbEmpleadoMetLifeNo.click();
		txtActEconomicaEmpresa.sendKeys(actividadEcoEmpresa);
		txtActEconomicaEmpresa.sendKeys(Keys.TAB);
		txtDireccionTrabajo.sendKeys(direTrabajo);
		sltPaisLugarTrabajo.selectByVisibleText(paisTrabajo);
		help.wait(2000);
		sltDeptoLugarTrabajo.selectByVisibleText(deptoTrabajo);
		help.wait(3000);
		sltCiudadLugarTrabajo.selectByVisibleText(ciudadTrabajo);
		txtTelefonoEmpresa.sendKeys(teleEmpresa);
		txtActEconomicaPrincipal.sendKeys(actEconoPrincipal);
		txtActEconomicaPrincipal.sendKeys(Keys.TAB);
		rdbPreguntaInfoLaboral1.click();
		rdbPreguntaInfoLaboral1.click();
		rdbPreguntaInfoLaboral2.click();
		rdbPreguntaInfoLaboral3.click();
		rdbPreguntaInfoLaboral4.click();
		rdbPreguntaInfoLaboral5.click();
		txtOtrosIngresos.sendKeys(otrosIngresos);
		sltConceptoOtrosIngresos.selectByIndex(9);
		sltPaisOrigenIngresos.selectByVisibleText(paisOrigenIngresos);
		txtTotalActvos.sendKeys(totalActivos);
		txtEgresosMensuales.sendKeys(egresosMensuales);
		txtTotalPasivos.sendKeys(totalPasivos);
		sltOrigenFondosAsegurado.selectByVisibleText(origenFondosAseg);
		rdbPreguntaInfoFinanciera1.click();
		rdbPreguntaDeclaracionImpu1.click();
		btnContinuarFinanciacion.click();
		help.wait(8000);
		btnContinuarInfoAsegurado.click();
		help.wait(3000);
		rdbFirmaDeclaracion.click();
		help.wait(3000);
		chkAcuerdo.click();
		btnContinuarDeclaracion.click();
		help.wait(3000);
		sltFormaPago.selectByIndex(2);
		help.wait(3000);
		stlOtraFormaPago.selectByIndex(2);
		String handlePrincipal = getDriver().getWindowHandle();
		btnVerReciboPago.click();
		help.wait(2000);
		getDriver().switchTo().alert().accept();
		help.wait(4000);
		getDriver().switchTo().window(handlePrincipal);
		help.wait(2000);
		btnContinuarPago.click();
		help.wait(3000);
		int index = 2;
		String archivo = "FileUploadCertif.exe";
		WebElement btnSubirDoc = getDriver().findElement(By.id("fileUploadBtn"));
		for (int i=1; i<5; i++){
			
			if (i==2){
				index =5;
				archivo ="FileUploadExtrac.exe";
			}else{
				if (i==3){
					index =6;
					archivo ="FileUploadFirma.exe";
				}else{
					
					if (i==4){
					index =8;
					archivo ="FileUploadIdentif.exe";
					}
				}
			}
				
			stlCargarDoc.selectByIndex(index);
			help.wait(2000);
			btnSubirDoc.click();
		    help.wait(5000);
		    try {
		    	Runtime.getRuntime().exec("C:\\Upload\\" + archivo);
		    } catch (IOException e) {
		    	e.printStackTrace();
		    }
		    help.wait(8000);
			
		}
			
		//lblIdSolicitud.getText();
		//System.out.println(lblIdSolicitud);
		btnPresentarSolicitud.click();
		help.wait(3000);
		btnConfirmarSolicitud.click();
		help.wait(90000);
		
		
					
	}
	
	
	
	
}

