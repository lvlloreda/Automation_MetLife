package com.qvision.metlife.steps;

import net.thucydides.core.annotations.Step;
import com.qvision.metlife.pages.NewApprovalResquetMetlifeSgsPages;

public class NewApprovalResquetMetLifeSgsSteps {
	
	NewApprovalResquetMetlifeSgsPages newApprovalSgs;
	
	@Step
	public void newApproval (){
		newApprovalSgs.aproAdministrativa();
		
	}
	
	 

}
