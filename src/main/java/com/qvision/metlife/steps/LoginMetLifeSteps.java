package com.qvision.metlife.steps;

import com.qvision.metlife.pages.LoginMetLifePages;

import net.thucydides.core.annotations.Step;

public class LoginMetLifeSteps {
	
	LoginMetLifePages loginMetLife;
	
	@Step
	public void openBrowser() {
		
		loginMetLife.open();
		
	}
	
	@Step
	public void formLogin(String user, String passwd) {
		loginMetLife.formLogin(user,passwd);
	}
	
	@Step
	public void validateAcces() {
		loginMetLife.validateAccess();
	}

}
