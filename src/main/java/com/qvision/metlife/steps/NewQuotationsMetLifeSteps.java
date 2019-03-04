package com.qvision.metlife.steps;

import com.qvision.metlife.pages.NewQuotationsMetLifePages;

import net.thucydides.core.annotations.Step;

public class NewQuotationsMetLifeSteps {
	
	NewQuotationsMetLifePages newQuotation;
	
	@Step
	public void newQuotationSteps(String primerNombreFam, String segundoNombreFam, String tercerNombreFam, String primerApellidoFam, 
			String segundorApellidoFam, String relacionFam, String ocupacionFam, String fechaNacimientoFam, String genero, 
			String tipoDocumentoFam, String documentoFam, String montoInvertir, String tipoPago, String valorAsegurado, 
			String anhosFaltantes){
		
		newQuotation.newQuotationPage(primerNombreFam, segundoNombreFam, tercerNombreFam, primerApellidoFam, segundorApellidoFam, 
				relacionFam, ocupacionFam, fechaNacimientoFam, genero, tipoDocumentoFam, documentoFam, montoInvertir, tipoPago, 
				valorAsegurado, anhosFaltantes);
	}

}
