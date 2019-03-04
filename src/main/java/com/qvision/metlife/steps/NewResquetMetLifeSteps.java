package com.qvision.metlife.steps;

import net.thucydides.core.annotations.Step;
import com.qvision.metlife.pages.NewResquetMetLifePages;


public class NewResquetMetLifeSteps {
	NewResquetMetLifePages newResquet;
	
	@Step
public void newResquetSteps(String paisNac, String deptoNac, String ciudadNac, String direccionResid, String paisResid, 
		String deptoResid, String ciudadResid, String telefonoResid, String tipoBeneficiario, String tipoDocBene, 
		String documentoBene, String primerNomBene, String segundoNomBene, String primerApellBene, String segundoApellBene, 
		String relacionAsegurado, String fechaNaciBene, String generoBene, String planBene, String porcentaje, String estatura, String peso, 
		String tipoActividad, String nitEmpresa, String nombreEmpresa, String actividadEcoEmpresa, String direTrabajo, 
		String paisTrabajo, String deptoTrabajo, String ciudadTrabajo, String teleEmpresa, String actEconoPrincipal, 
		String otrosIngresos, String paisOrigenIngresos, String totalActivos, String egresosMensuales, String totalPasivos, 
		String origenFondosAseg){
		
		newResquet.newResquetPage(paisNac, deptoNac, ciudadNac, direccionResid, paisResid, deptoResid, ciudadResid, telefonoResid, tipoBeneficiario, 
				tipoDocBene, documentoBene, primerNomBene, segundoNomBene, primerApellBene, segundoApellBene, relacionAsegurado, fechaNaciBene, generoBene,
				planBene, porcentaje, estatura, peso, tipoActividad, nitEmpresa, nombreEmpresa, actividadEcoEmpresa, direTrabajo, paisTrabajo, 
				deptoTrabajo, ciudadTrabajo, teleEmpresa, actEconoPrincipal, otrosIngresos, paisOrigenIngresos, totalActivos, egresosMensuales, 
				totalPasivos, origenFondosAseg);
	}

}
