package com.qvision.metlife.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

import com.qvision.metlife.utils.Helpers;

public class NewNecessitiesAnalysisMetLifePages extends PageObject{
	
	Helpers help = new Helpers();
	
	@FindBy(id = "btnContinueToNeeds")
	WebElement btnAnalisisNecesidades;
	
	@FindBy(id = "txtSalaryPensionar")
	WebElement txtSalarioDeseado;
	
	@FindBy(id = "txtAverageMonthlyIncomeOfLastTenYearsPension")
	WebElement txtIngresoMensual;
	
	@FindBy (id = "txtListedWeeksPensionar")
	WebElement txtSemanasCotizadas;
	
	@FindBy (id = "txtAgeAtWhichYouWantPensionar")
	WebElement txtEdadPension;
	
	@FindBy (id = "retire_calculateButton")
	WebElement 	btnCalcularRetiro;
	
	@FindBy (id = "tabSummary")
	WebElement lnkResumenFinal;
	
	@FindBy (id = "summaryIllustrationButton")
	WebElement btnCotizar;
	
	
public void necessitiesAnalysis(String salarioDeseado, String ingresoMensual, String semanasCotizadas, String edadPension){
		help.wait(2000);
		btnAnalisisNecesidades.click();
		help.wait(2000);
		txtSalarioDeseado.sendKeys(salarioDeseado);
		txtIngresoMensual.sendKeys(ingresoMensual);
		txtSemanasCotizadas.sendKeys(semanasCotizadas);
		txtEdadPension.sendKeys(edadPension);
		btnCalcularRetiro.click();
		help.wait(2000);
		lnkResumenFinal.click();
		help.wait(5000);
		btnCotizar.click();
		help.wait(15000);
		
	}
	
}
