package com.qvision.metlife.steps;

import com.qvision.metlife.pages.CreateCustomerMetLifePages;

import net.thucydides.core.annotations.Step;

public class CreateCustomerMetLifeSteps {

	CreateCustomerMetLifePages createCustumer;

	/*@Step
	public void goCreateCustumer() {

		createCustumer.pageCreateCustomer();
	}*/

	@Step
	public void typeForm(String primerNombre, String segundoNombre, String tercerNombre, String primerApellido,
			String segundoApellido, String fechaDeNacimiento, String nacionalidad, String genero, String clienteFumador,
			String estadoCivil, String ocupacion, String tipoIdentificacion, String numeroIdentificacion,
			String ingresosMensuales, String email, String tipoTelefono, String numeroTelefono) {

		createCustumer.typeInForm(primerNombre, segundoNombre, tercerNombre, primerApellido, segundoApellido,
				fechaDeNacimiento, nacionalidad, genero, clienteFumador, estadoCivil, ocupacion, tipoIdentificacion,
				numeroIdentificacion, ingresosMensuales, email, tipoTelefono, numeroTelefono);
	}
	
	
	
	
	/*
	@Step
	public void validateCustumer() {
		
		createCustumer.validateCustumer();
	}*/

}
