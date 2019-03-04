package com.qvision.metlife.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.qvision.metlife.utils.Helpers;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class NewApprovalResquetMetlifeSgsPages extends PageObject{
	Helpers help = new Helpers();
	LoginSgsMetLifePage loginSgs = new LoginSgsMetLifePage();
	
	//Aprobación Administrativo
	@FindBy (id = "btnAuditar")
	WebElement 	btnIniciarAsis;
	
	@FindBy (xpath = "//*[@id='acdAuditarSolicitud']/div[1]/div[1]/h4/a")
	WebElement btnAuditarDatosAsegAsis;
	
	@FindBy (xpath = "//*[@id='frmAuditoria']/div[18]/div/label[1]/div/ins")
	WebElement rdbConfirmacionDatosSi;
	
	
	
	
	
	
	//Aprobación Suscripción
	@FindBy (xpath = "//*[@id='pcont']/div[2]/div/div/div/div/div/a")
	WebElement 	btnIniciarSusc;
		
	@FindBy (id = "AprobarSolicitud")
	WebElement btnAprobarSolicitudSusc;
	
	
	//Aprobación Cartera
	
	@FindBy (xpath = "//*[@id='tblCartera_filter']/label/input")
	WebElement txtBuscarCart;

	public void aproAdministrativa (){
		loginSgs.iniciarSesionSgs("USER_SGS31", "Colombia1");
		help.wait(3000);
		btnIniciarAsis.click();
		help.wait(1000);
		btnAuditarDatosAsegAsis.click();
		help.wait(1000);	
		for (int i=1; i<16; i++){
			WebElement rdbDatosAseg = getDriver().findElement(By.xpath("//*[@id='frmAuditoria']/div["+i+"]/div[2]/label[1]/div/ins"));
			JavascriptExecutor executor1 = (JavascriptExecutor)getDriver();
			executor1.executeScript("arguments[0].click();", rdbDatosAseg);
		}
		
		rdbConfirmacionDatosSi.click();
		
		
	
		
	}
	
	public void aproSupscriptor (){
		loginSgs.iniciarSesionSgs("USER_SGS31", "Colombia1");
	}
   
   
	public void aproCartera (){
		loginSgs.iniciarSesionSgs("USER_SGS33", "Colombia1");
	}

}
