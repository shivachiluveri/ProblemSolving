package testCases;

import objectRepository.ForgotPassWordPage;
import objectRepository.LogInPage;
import objectRepository.RegisterPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class ForgotPassWord extends Base{
	@BeforeTest
	void openHoW() throws Exception {
		CustomerScenarios.phoneNum();
		CustomerScenarios.fname();
		CustomerScenarios.lname();
		driver =initializeDriver();
	}
	@Test
	public void forgotMail(){
		ForgotPassWordPage objF = new ForgotPassWordPage(driver);
		LogInPage.link_Login(driver).click();
		RegisterPage.link_forgotPassword(driver).click();
		objF.textBox_EnterEmail().sendKeys(prop.getProperty("forgotEmail"));
		objF.button_submit().click();
		String s = objF.text_confirmationText().getText();
			if(s.equalsIgnoreCase("Your password has been sent successfully to your registered email.")){
			System.out.println("mail sent successfully");
			
		}
		else{
			System.out.println("Email format should be abc@gmail.com");
		}
	}
}
