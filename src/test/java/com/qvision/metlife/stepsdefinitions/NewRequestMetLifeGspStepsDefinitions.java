package com.qvision.metlife.stepsdefinitions;

import java.util.List;
import java.util.Map;

import com.qvision.metlife.steps.CreateCustomerMetLifeSteps;
import com.qvision.metlife.steps.LoginMetLifeSteps;
import com.qvision.metlife.steps.NewApprovalResquetMetLifeSgsSteps;
import com.qvision.metlife.steps.NewNecessitiesAnalysisMetLifeSteps;
import com.qvision.metlife.steps.NewQuotationsMetLifeSteps;
import com.qvision.metlife.steps.NewResquetMetLifeSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NewRequestMetLifeGspStepsDefinitions {

	@Steps
	LoginMetLifeSteps loginMetlife;
	@Steps
	CreateCustomerMetLifeSteps createCustumer;
	@Steps
	NewNecessitiesAnalysisMetLifeSteps newNecessitiesAnalysis;
	@Steps
	NewQuotationsMetLifeSteps newQuotationSteps;
	@Steps
	NewResquetMetLifeSteps newResquetStesp;
	@Steps
	NewApprovalResquetMetLifeSgsSteps newApprovalSteps;
	

	@Given("^I want create a new custumer for the webpages$")
	public void iWantCreateANewCustumerForTheWebpages() {
		loginMetlife.openBrowser();
		loginMetlife.formLogin("4000002", "metlife1");
		loginMetlife.validateAcces();
		//createCustumer.goCreateCustumer();
	}

	@When("^We are go to type in the form$")
	public void weAreGoToTypeInTheForm(DataTable arg1) {
		List<Map<String, String>> listData = arg1.asMaps(String.class, String.class);
		createCustumer.typeForm(listData.get(0).get("PrimerNombre"), listData.get(0).get("SegundoNombre"), listData.get(0).get("TercerNombre"),
				listData.get(0).get("PrimerApellido"), listData.get(0).get("SegundoApellido"), listData.get(0).get("FechaDeNacimiento"), listData.get(0).get("Nacionalidad"), 
				listData.get(0).get("Genero"), listData.get(0).get("ClienteFumador"), listData.get(0).get("EstadoCivil"),
				listData.get(0).get("Ocupacion"), listData.get(0).get("TipoDeIdentificacion"), listData.get(0).get("NumeroDeIdentificacion"), listData.get(0).get("IngresosMensuales"), 
				listData.get(0).get("Email"), listData.get(0).get("TipoDeTelefono"), listData.get(0).get("NumeroDetelefono"));
	}

	@When("^New necessities analysis$")
	public void newNecessitiesAnalysis(DataTable arg1) {
	   List<Map<String, String>> listData = arg1.asMaps(String.class, String.class);
	   newNecessitiesAnalysis.necessitiesAnalysis(listData.get(0).get("SalarioDeseado"), listData.get(0).get("IngresoMensual"), listData.get(0).get("SemanasCotizadas"), listData.get(0).get("EdadPension"));
	 
	}

	@When("^New quotation$")
	public void newQuotation(DataTable arg1) {
	    List<Map<String, String>> listData = arg1.asMaps(String.class, String.class);
	    newQuotationSteps.newQuotationSteps(listData.get(0).get("PrimerNombreFam"), listData.get(0).get("SegundoNombreFam"), 
	    		listData.get(0).get("TercerNombreFam"), listData.get(0).get("PrimerApellidoFam"), listData.get(0).get("SegundorApellidoFam"), 
	    		listData.get(0).get("RelacionFam"), listData.get(0).get("OcupacionFam"), listData.get(0).get("FechaNacimientoFam"), 
	    		listData.get(0).get("Genero"), listData.get(0).get("TipoDocumentoFam"), listData.get(0).get("DocumentoFam"),
	    		listData.get(0).get("MontoInvertir"), listData.get(0).get("TipoPago"), listData.get(0).get("ValorAsegurado"),
	    		listData.get(0).get("AnhosFaltantes"));
}

	@When("^New request$")
	public void newRequest(DataTable arg1) {
	    List<Map<String, String>> listData = arg1.asMaps(String.class, String.class);
	    newResquetStesp.newResquetSteps(listData.get(0).get("PaisNac"), listData.get(0).get("DeptoNac"), 
	    		listData.get(0).get("CiudadNac"), listData.get(0).get("DireccionResid"), listData.get(0).get("PaisResid"), 
	    		listData.get(0).get("DeptoResid"), listData.get(0).get("CiudadResid"), listData.get(0).get("TelefonoResid"), 
	    		listData.get(0).get("TipoBeneficiario"), listData.get(0).get("TipoDocBene"), listData.get(0).get("DocumentoBene"),
	    		listData.get(0).get("PrimerNomBene"), listData.get(0).get("SegundoNomBene"), listData.get(0).get("PrimerApellBene"),
	    		listData.get(0).get("SegundoApellBene"),listData.get(0).get("RelacionAsegurado"),listData.get(0).get("FechaNaciBene"),
	    		listData.get(0).get("Genero"), listData.get(0).get("PlanBene"),listData.get(0).get("Porcentaje"),listData.get(0).get("Estatura"),
	    		listData.get(0).get("Peso"),listData.get(0).get("TipoActividad"),listData.get(0).get("NitEmpresa"),
	    		listData.get(0).get("NombreEmpresa"),listData.get(0).get("ActividadEcoEmpresa"),listData.get(0).get("DireTrabajo"),
	    		listData.get(0).get("PaisTrabajo"),listData.get(0).get("DeptoTrabajo"),listData.get(0).get("CiudadTrabajo"),
	    		listData.get(0).get("TeleEmpresa"),listData.get(0).get("ActEconoPrincipal"),listData.get(0).get("OtrosIngresos"),
	    		listData.get(0).get("PaisOrigenIngresos"),listData.get(0).get("TotalActivos"),listData.get(0).get("EgresosMensuales"),
	    		listData.get(0).get("TotalPasivos"),listData.get(0).get("OrigenFondosAseg"));
	    		
	}
	
	
	@When("^New approval sgs$")
	public void newApprovalSgs() {
		newApprovalSteps.newApproval();
	}

	
	
	@Then("^I validate the new quotation$")
	public void iValidateTheNewQuotation() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Then("^I validate the new request$")
	public void iValidateTheNewRequest() {
	    // Write code here that turns the phrase above into concrete actions
	    	}

	
	@Then("^I validate the new Custumer$")
	public void iValidateTheNewCustumer() {
		//createCustumer.validateCustumer();
	}
	
}
