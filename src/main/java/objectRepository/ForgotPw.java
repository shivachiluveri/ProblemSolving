package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPw {

//	public static BaseClass bc = BaseClass.getInstance();
//	public static WebDriver driver = BaseClass.driver;
	public static WebDriver driver;
	public static WebElement element = null;

	public static WebElement button_Login() {

		element = driver.findElement(By.xpath("//*[@id='loginlink']"));// pbm
																		// with
																		// xpath
		return element;

	}

	public static WebElement link_ForgotPw() {

		element = driver.findElement(By.xpath("//a[@class='login-link']"));
		return element;

	}

	public static WebElement input_Email() {

		element = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		return element;

	}

	public static WebElement button_Submit() {

		element = driver.findElement(By.xpath("//input[@value='Submit']"));
		return element;

	}

}
