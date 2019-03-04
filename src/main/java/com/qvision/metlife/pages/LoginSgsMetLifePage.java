package com.qvision.metlife.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.qvision.metlife.utils.Helpers;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginSgsMetLifePage extends PageObject{
	
	Helpers help = new Helpers();
	
	@FindBy (id = "UserIdInput")
	WebElement txtUser;
	
	@FindBy (id = "pwdtxt")
	WebElement txtPassword;
	
	@FindBy (id ="DOMAIN")
	WebElementFacade sltDomain;
	
	@FindBy (id = "SignInButtonText")
	WebElement btnIniciarSesion;
	
	public void iniciarSesionSgs (String user, String password){
		getDriver().get("https://uat.sgs.metlife.com.co:8093");
		help.wait(2000);
		txtUser.sendKeys(user);
		((JavascriptExecutor) getDriver())
		.executeScript("document.getElementById('pwdtxt').value='" + password + "'");
		//txtPassword.sendKeys(password);
		sltDomain.selectByIndex(4);
		help.wait(2000);
		btnIniciarSesion.click();
		help.wait(5000);
		
	}
	

}
