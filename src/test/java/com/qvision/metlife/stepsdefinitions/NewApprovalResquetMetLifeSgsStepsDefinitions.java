package com.qvision.metlife.stepsdefinitions;

import net.thucydides.core.annotations.Steps;
import com.qvision.metlife.steps.NewApprovalResquetMetLifeSgsSteps;
import cucumber.api.java.en.Given;

public class NewApprovalResquetMetLifeSgsStepsDefinitions {
	@Steps
	NewApprovalResquetMetLifeSgsSteps newApprovalSteps;
	
	@Given("^I want to approve a new resquet in SGS$")
	public void iWantToApproveANewResquetInSGS() {
		newApprovalSteps.newApproval();
	}



}
