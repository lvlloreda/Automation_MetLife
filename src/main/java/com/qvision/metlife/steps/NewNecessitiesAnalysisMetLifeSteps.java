package com.qvision.metlife.steps;

import com.qvision.metlife.pages.NewNecessitiesAnalysisMetLifePages;
import net.thucydides.core.annotations.Step;

public class NewNecessitiesAnalysisMetLifeSteps {
	
	NewNecessitiesAnalysisMetLifePages newNecessitiesAnalysis;
	
	@Step
	public void necessitiesAnalysis(String salarioDeseado, String ingresoMensual, String semanasCotizadas, String edadPension) {
		newNecessitiesAnalysis.necessitiesAnalysis(salarioDeseado, ingresoMensual, semanasCotizadas, edadPension);
	}

}
