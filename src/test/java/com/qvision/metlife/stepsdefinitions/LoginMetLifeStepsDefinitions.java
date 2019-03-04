package com.qvision.metlife.stepsdefinitions;

import com.qvision.metlife.steps.LoginMetLifeSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginMetLifeStepsDefinitions {
	
	@Steps
	LoginMetLifeSteps loginMetlife;

	@Given("^I want open the browser with the MetLife webpage$")
	public void iWantOpenTheBrowserWithTheMetLifeWebpage() {
		loginMetlife.openBrowser();
	}

	@When("^I type (.*) and (.*)$")
	public void iTypeAnd(String user, String passwd) {
		loginMetlife.formLogin(user,passwd);
	}

	@Then("^verify access$")
	public void verifyAccess() {
		loginMetlife.validateAcces();
	}



}
