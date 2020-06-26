package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import PageObjects.WebElement;
public class RegisterPage {

	public static WebElement element = null;
	public static WebElement TextBox_FirstName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtFirstName']"));
		return element;
	}

	public static WebElement TextBox_LastName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtLastName']"));
		return element;
	}

	public static WebElement Dropdown_Age(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@id='txtAge']"));
		return element;
	}

	public static WebElement TextBox_FirstNe(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtFirstName']"));
		return element;
	}

	public static WebElement TextBox_Phone(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtMobile']"));
		return element;
	}

	public static WebElement RadioButton_Gender(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='rboGendermale']"));
		return element;
	}

	public static WebElement TextBox_Email(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//input[@name='customerDto.Email']"));
		return element;
	}

	public static WebElement TextBox_PassWord(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//input[@id='txtPasswordCustomer']"));
		return element;
	}

	public static WebElement TextBox_ConfirmPW(WebDriver driver) {
		element = driver.findElement(By
				.xpath("//input[@id='txtConfirmPassword']"));
		return element;
	}

	public static WebElement Button_Register(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[@id='btnRegister']"));
		return element;
	}
	public static WebElement link_forgotPassword(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='loginform']/a"));
		return element;
	}
	


}


	