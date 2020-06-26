package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassWordPage {
	public WebDriver driver;

	
	By enterEmail = By.xpath("//*[@id='txtUsername']");
	By submit = By.xpath("//*[@id='btn-Save']");
	By confirmationText = By.xpath("//*[@id='resultMessage']");
	By test = By.xpath("test");
	
	public ForgotPassWordPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement textBox_EnterEmail() {
		return driver.findElement(enterEmail);
	}
	public WebElement button_submit() {
		return driver.findElement(submit);
	}
	public WebElement text_confirmationText() {
		return driver.findElement(confirmationText);
	}
	public WebElement textBox_Test() {
		return driver.findElement(test);
	}
}
